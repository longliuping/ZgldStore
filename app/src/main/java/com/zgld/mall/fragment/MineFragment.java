package com.zgld.mall.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.zgld.mall.R;
import com.zgld.mall.SysApplication;
import com.zgld.mall.UserDataShare;
import com.zgld.mall.activity.BuyersOrdersFragmentActivity;
import com.zgld.mall.activity.LoginActivity;
import com.zgld.mall.activity.PersonalDataActivity;
import com.zgld.mall.activity.RecommendUserFragmentActivity;
import com.zgld.mall.activity.SettingActivity;
import com.zgld.mall.activity.UserAccountActivity;
import com.zgld.mall.beans.AspnetUsers;
import com.zgld.mall.beans.YAccount;
import com.zgld.mall.utils.Contents;

import org.w3c.dom.Text;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link MineFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MineFragment extends BaseFragment implements View.OnClickListener{
    String menuString[] = {"我的订单","我的账户","我推荐的会员","设置"};
    int menuInt[] = {R.drawable.me_order,R.drawable.me_love,R.drawable.me_product,R.drawable.me_setting};
    ListView list_menu;

    public MineFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MineFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MineFragment newInstance(String param1, String param2) {
        MineFragment fragment = new MineFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void handleMsg(Message msg) {

    }

    Activity activity;
    View null_user;
    View default_user;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.activity = this.getActivity();
    }
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =inflater.inflate(R.layout.fragment_mine, container, false);
        view.findViewById(R.id.back).setVisibility(View.GONE);
        TextView title = (TextView) view.findViewById(R.id.title_center);
        title.setText("我的");
        null_user = view.findViewById(R.id.null_user);
        default_user = view.findViewById(R.id.default_user);
        null_user.setOnClickListener(this);
        default_user.setOnClickListener(this);
        ImageView null_user_imageview = (ImageView) view.findViewById(R.id.null_user_imageview);
        null_user_imageview.setImageResource(R.drawable.default_avatar);
        list_menu = (ListView) view.findViewById(R.id.list_menu);
        list_menu.setAdapter(new MenuAdapter());
        list_menu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if(position<3){
                   YAccount users = new UserDataShare(activity).getUserData();
                   if(users!=null){
                       if (position == 0) {
                           startActivity(new Intent(getActivity(), BuyersOrdersFragmentActivity.class));
                       }
                       if(position==1){
                           startActivity(new Intent(getActivity(), UserAccountActivity.class));
                       }
                       if(position==2){
                           startActivity(new Intent(getActivity(), RecommendUserFragmentActivity.class));
                       }
                   }else{
                       Intent intent = new Intent();
                       intent.setClass(getActivity(),LoginActivity.class);
                       startActivityForResult(intent, 200);
                   }
               }
                if (position == 3) {
                    startActivity(new Intent(getActivity(), SettingActivity.class));
                }
            }
        });

        initData();
        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode==activity.RESULT_OK){
            if(requestCode==200){
                initData();;
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
    void initData(){
        YAccount users = new UserDataShare(activity).getUserData();
        if(users!=null){
            default_user.setVisibility(View.VISIBLE);
            null_user.setVisibility(View.GONE);
            TextView name = (TextView) view.findViewById(R.id.name);
            name.setText(users.getAccountName());
            TextView cdk_number = (TextView) view.findViewById(R.id.cdk_number);
            cdk_number.setText("账号："+users.getUserProfile().getUserId()+"");
            ImageView head = (ImageView) view.findViewById(R.id.head);
            SysApplication.DisplayUserImage(users.getAccountHead(), head);
        }else{
            default_user.setVisibility(View.GONE);
            null_user.setVisibility(View.VISIBLE);
        }
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.null_user:
                intent.setClass(getActivity(),LoginActivity.class);
                startActivityForResult(intent, 200);
                break;
            case R.id.default_user:
                intent.setClass(getActivity(),PersonalDataActivity.class);
                startActivityForResult(intent, 200);
                break;
        }
    }

    class MenuAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return menuString.length;
        }

        @Override
        public Object getItem(int position) {
            return menuString[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder vh = null;
            if(convertView==null){
                vh = new ViewHolder();
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_me_menu, null);
                vh.item_name = (TextView) convertView.findViewById(R.id.item_name);
                vh.item_image = (ImageView) convertView.findViewById(R.id.item_image);
                convertView.setTag(vh);
            }else{
                vh = (ViewHolder) convertView.getTag();
            }
            if(menuString[position]!=null) {
                vh.item_name.setText(menuString[position]);
                vh.item_image.setImageResource(menuInt[position]);
            }
            return convertView;
        }
        class ViewHolder{
            TextView item_name;
            ImageView item_image;
        }
    }
}
