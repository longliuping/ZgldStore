package com.zgld.mall.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Message;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zgld.mall.R;
import com.zgld.mall.UserDataShare;
import com.zgld.mall.adapter.PersonalDataAdapter;
import com.zgld.mall.beans.AspnetUsers;
import com.zgld.mall.beans.Personal;
import com.zgld.mall.beans.ProductImageUpload;
import com.zgld.mall.beans.YAccount;
import com.zgld.mall.utils.BitmapUtil;
import com.zgld.mall.utils.BroadcastUtils;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.utils.CustomDialog;

import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonalDataActivity extends BaseActivity implements View.OnClickListener, CustomDialog.CustomDialogListener,AdapterView.OnItemClickListener {
    CustomDialog dialog;
    private Context mContext=null;
    ListView listview;
    List<Personal> listInfo = new ArrayList<>();
    PersonalDataAdapter infoAdapter;
    CustomDialog customDialog;
    View logout;
    @Override
    public void handleMsg(Message msg) {
        try {
            String json = msg.getData().getString(Contents.JSON);
            if (json == null) {
                return;
            }
            switch (msg.what) {
                case 201:
                    if(msg.getData().getInt(Contents.STATUS)==200){
                        JSONObject jsonObject = new JSONObject(json).getJSONObject(Contents.DATA).getJSONObject(Contents.INFO);
                        Gson gson = new Gson();
                        YAccount user = gson.fromJson(jsonObject.toString(), new TypeToken<YAccount>() {
                        }.getType());
                        new UserDataShare(this).saveUserData(user);
                        initData();
                        setResult(RESULT_OK);
                    }
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_personal_data);
        mContext=PersonalDataActivity.this;
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
        TextView title = (TextView) findViewById(R.id.title);
        title.setText(getString(R.string.title_personal_data));
        listview = (ListView) findViewById(R.id.listview);
        listview.setOnItemClickListener(this);
        Map<String,String> m = new HashMap<>();
        YAccount user = new UserDataShare(this).getUserData();
        if(user==null){
            finish();
            return;
        }
        logout = findViewById(R.id.logout);
        logout.setOnClickListener(this);
        logout.setVisibility(View.VISIBLE);
        m.put(Contents.TOKEN,user.getUsers().getAppUserToken());
        m.put(Contents.USERID, user.getUsers().getUserId() + "");
        getData( 201, "user/userinfo.html", m, null);
        initData();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.logout:
                customDialog = new CustomDialog(this, R.style.mystyle, R.layout.customdialog, R.array.title_logout, new CustomDialog.CustomDialogListener() {
                    @Override
                    public void customDialogClickLeft() {
                        customDialog.dismiss();;
                    }

                    @Override
                    public void customDialogClickRight() {
                        customDialog.dismiss();
                        new UserDataShare(PersonalDataActivity.this).logout();
                        BroadcastUtils.sendUserLogout(PersonalDataActivity.this);
                        Contents.loginPage(PersonalDataActivity.this, null, 200);
                        PersonalDataActivity.this.finish();
                    }
                });
                customDialog.show();
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if(requestCode==208){
                initData();
            }
            if (requestCode == Contents.PHOTORESOULT) {
                Bundle extras = data.getExtras();
                if (extras != null) {
                    uploadPhoto(extras);
                }
            }
            if (data != null && requestCode == Contents.PHOTO) {
                startPhotoZoom(data.getData(), true);
            }
            File file = new File(Contents.picFileFullName);
            if (requestCode == Contents.PHOTOHRAPH) {
                startPhotoZoom(Uri.fromFile(file), true);
            }
        }
        initData();
    }
    private void uploadPhoto(Bundle extras) {
        Map<String,String> m = new HashMap<>();
        Bitmap bitmap = extras.getParcelable("data");
        String result = BitmapUtil.bitmapToBase64(bitmap);
        m.put("userinfo.accountHead",result);
        getData(201, "user/update_user_head.html",m,null);
    }

    void initData() {
        YAccount user = new UserDataShare(this).getUserData();
        if(user!=null){
            int types[] = new int[]{2,1,1,1,1,1,1};
            String names[] = new String[]{"上传头像","性别","电话号码","手机号码","电子邮件","修改密码","管理收货地址"};
            String values[] = new String[]{user.getAccountHead()+"",Contents.getSex(user.getAccountSex()),user.getUserProfile().getCellPhone(),user.getUserProfile().getTelPhone(),user.getAccountEmail(),"",""};
            Class className[] = new Class[]{null,UpdateUserSexActivity.class,UpdateUserCellPhoneActivity.class,UpdateTelPhoneActivity.class,UpdateUserEmailActivity.class,UpdateUserPasswordActivity
            .class,AddressManagerActivity.class};
            listInfo = new ArrayList<>();
            for (int i=0;i < types.length;i++)
            {
                Personal info = new Personal();
                info.setType(types[i]);
                info.setName(names[i]);
                info.setValue(values[i]);
                info.setClassName(className[i]);
                listInfo.add(info);
            }
            infoAdapter = new PersonalDataAdapter(this,listInfo);
            listview.setAdapter(infoAdapter);
        }else {
            Contents.loginPage(this,null,200);
        }
    }

    @Override
    public void customDialogClickLeft() {
        dialog.dismiss();
        Intent intent = new Intent();
        intent.setType("image/*");/* 开启Pictures画面Type设定为image */
        intent.setAction(Intent.ACTION_GET_CONTENT);/* 使用Intent.ACTION_GET_CONTENT这个Action */
        startActivityForResult(intent, Contents.PHOTO);/* 取得相片后返回本画面 */
    }

    @Override
    public void customDialogClickRight() {
        dialog.dismiss();
        String state = Environment.getExternalStorageState();
        if (state.equals(Environment.MEDIA_MOUNTED)) {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            File outDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            if (!outDir.exists()) {
                outDir.mkdirs();
            }
            File outFile = new File(outDir, System.currentTimeMillis() + ".jpg");
            Contents.picFileFullName = outFile.getAbsolutePath();
            intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(outFile));
            intent.putExtra(MediaStore.EXTRA_VIDEO_QUALITY, 1);
            startActivityForResult(intent, Contents.PHOTOHRAPH);
        } else {
            Toast.makeText(PersonalDataActivity.this, getString(R.string.selected_sdcard_not_exists), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Personal info = listInfo.get(position);
        if(info.getType()==2){
            if(position==0){
                dialog = new CustomDialog(mContext, R.style.mystyle, R.layout.customdialog, R.array.title_upload_image, this);
                dialog.show();
            }
        }else{
            Intent intent = new Intent(this,info.getClassName());
            intent.putExtra("name","修改"+info.getName());
            startActivityForResult(intent,208);
        }
    }

}
