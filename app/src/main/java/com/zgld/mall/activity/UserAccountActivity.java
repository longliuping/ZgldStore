package com.zgld.mall.activity;

import android.app.Activity;
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

import com.zgld.mall.R;
import com.zgld.mall.UserDataShare;
import com.zgld.mall.beans.AspnetUsers;
import com.zgld.mall.beans.YAccount;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户账户
 */
public class UserAccountActivity extends BaseActivity implements AdapterView.OnItemClickListener{
    YAccount users;
    ListView listview;
    MenuAdapter menuAdapter;
    List<Menu> listInfo = new ArrayList<>();
    Class [] className = new Class[]{RechargeDetailsActivity.class,PresentDetailActivity.class,FreezeDetailsActivity.class};
    String [] names = new String[]{"充值明细","提现明细","冻结明细"};

    @Override
    public void handleMsg(Message msg) {

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
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this,listInfo.get(position).getClassName());
        intent.putExtra("name",listInfo.get(position).getName());
        startActivity(intent);
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
