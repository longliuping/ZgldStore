package com.zgld.mall.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zgld.mall.R;
import com.zgld.mall.UserDataShare;
import com.zgld.mall.beans.YAccount;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.utils.PriceUtil;
import org.json.JSONObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户账户
 */
public class UserAccountActivity extends BaseActivity implements AdapterView.OnItemClickListener,View.OnClickListener{
    YAccount users;
    ListView listview;
    MenuAdapter menuAdapter;
    List<Menu> listInfo = new ArrayList<>();
    Class [] className = new Class[]{InpourRequestActivity.class,BalanceDetailsActivity.class,BalanceDrawRequestActivity.class,BalanceFreezeDetailsActivity.class,PointDetailsActivity.class};
    String [] names = new String[]{"收入明细","充值明细","提现明细","冻结明细","积分明细"};
    View recharge;
    View withdraw;
    TextView balance;
    @Override
    public void handleMsg(Message msg) {
        try{
            String json = msg.getData().getString(Contents.JSON);
            if (json == null) {
                return;
            }
            if(msg.getData().getInt(Contents.STATUS)==200) {
                switch (msg.what){
                    case 209:
                            JSONObject jsonObject = new JSONObject(json).getJSONObject(Contents.DATA).getJSONObject(Contents.INFO);
                            Gson gson = new Gson();
                            YAccount user = gson.fromJson(jsonObject.toString(), new TypeToken<YAccount>() {
                            }.getType());
                            new UserDataShare(this).saveUserData(user);
                            Double balanceValue = user.getUserProfile().getBalance();
                            if(balanceValue!=null && balanceValue>0){
                                withdraw.setVisibility(View.VISIBLE);
                            }
                            balance.setText(PriceUtil.price(balanceValue+""));
                            setResult(RESULT_OK);

                        break;
                    case 202:
                            JSONObject jo = new JSONObject(msg.getData().getString(Contents.JSON)).getJSONObject(Contents.DATA).getJSONObject(Contents.INFO);
                            YAccount account = new Gson().fromJson(jo.toString(), new TypeToken<YAccount>() {
                            }.getType());
                            new UserDataShare(this).saveUserData(account);
                        balance.setText(PriceUtil.price(account.getUserProfile().getBalance() + ""));
                        break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_user_account);
        TextView title = (TextView) findViewById(R.id.title_center);
        title.setText("我的账户");
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        users = new UserDataShare(this).getUserData();
        if(users==null){
            finish();
            return;
        }
        listview = (ListView) findViewById(R.id.listview);
        listview.setOnItemClickListener(this);
        for (int i =0;i<names.length;i++){
            Menu info = new Menu();
            info.setClassName(className[i]);
            info.setName(names[i]);
            info.setId(i);
            listInfo.add(info);
        }

        menuAdapter = new MenuAdapter();
        listview.setAdapter(menuAdapter);
        menuAdapter.notifyDataSetChanged();
        recharge = findViewById(R.id.recharge);
        recharge.setOnClickListener(this);
        recharge.setVisibility(View.VISIBLE);

        withdraw = findViewById(R.id.withdraw);
        withdraw.setOnClickListener(this);
//        withdraw.setVisibility(View.GONE);
        balance = (TextView) findViewById(R.id.balance);
        balance.setText(PriceUtil.price(users.getUserProfile().getBalance()+""));
        initData();
    }
    private void initData(){
        Map<String,String> m = new HashMap<>();
        getData(UserAccountActivity.this,209, "user/userinfo.html", m, null);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this,listInfo.get(position).getClassName());
        intent.putExtra("name",listInfo.get(position).getName());
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.recharge:
                intent.setClass(this,UserRechargeActivity.class);
                startActivityForResult(intent, 200);
                break;
            case R.id.withdraw:
//                intent.setClass(this,UserWithdrawActivity.class);
//                startActivityForResult(intent, 200);
                Map m = new HashMap();
                m.put("amount",PriceUtil.price(new UserDataShare(this).getUserData().getUserProfile().getBalance()+""));
                m.put("remark","用户手机端申请提现");
                getData(this, 202, "account/user_apply_withdrawal.html", m,null);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==200){
            initData();
        }
    }
    class Menu implements Serializable{
        int id;
        String name;
        Class className;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Class getClassName() {
            return className;
        }

        public void setClassName(Class className) {
            this.className = className;
        }
    }
    class MenuAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return listInfo.size();
        }

        @Override
        public Object getItem(int position) {
            return listInfo.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }
        class ViewHolder{
            TextView item_name;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder vh;
            if(convertView==null){
                vh = new ViewHolder();
                convertView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.item_account_menu,null);
                vh.item_name = (TextView) convertView.findViewById(R.id.item_name);
                convertView.setTag(vh);
            }else{
                vh = (ViewHolder) convertView.getTag();
            }
            Menu info = listInfo.get(position);
            if(info!=null){
                vh.item_name.setText(info.getName());
            }
            return convertView;
        }
    }
}
