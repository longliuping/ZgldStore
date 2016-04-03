package com.zgld.mall;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Message;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zgld.mall.beans.AspnetMembers;
import com.zgld.mall.beans.AspnetUsers;
import com.zgld.mall.beans.UserToken;
import com.zgld.mall.utils.BroadcastUtils;
import com.zgld.mall.utils.Contents;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 保存用户数据
 * 
 * @author Administrator
 * 
 */
public class UserDataShare implements OnSharedPreferenceChangeListener {
	final String NAME_SHARE = "loginUserInfo";
	final String NAME = "name";
	final String PWD = "pwd";
	final String USERID = "userId";
	final String ISLOGIN = "islogin";
	Context context;
	SharedPreferences haredPreferences;
	UserDataShareChangeListener listener;

	public interface UserDataShareChangeListener {
		void update(SharedPreferences arg0, String arg1);
	}

	public UserDataShare(Context context) {
		this.context = context;
		this.haredPreferences = context.getSharedPreferences(NAME_SHARE, Activity.MODE_PRIVATE);
		this.haredPreferences.registerOnSharedPreferenceChangeListener(this);
	}

	public UserDataShare(Context context, UserDataShareChangeListener listener) {
		// TODO Auto-generated constructor stub
		this.context = context;
		this.haredPreferences = context.getSharedPreferences(NAME_SHARE, Activity.MODE_PRIVATE);
		this.haredPreferences.registerOnSharedPreferenceChangeListener(this);
		this.listener = listener;
	}

	/**
	 * 更新用户信息
	 * @param message
	 * @return
	 * @throws JSONException
	 */
	public AspnetUsers updateUser(Message message) throws JSONException {
		JSONObject jsonObject = new JSONObject(message.getData().getString(Contents.JSON)).getJSONObject(Contents.DATA).getJSONObject(Contents.INFO);
		String json = jsonObject.toString();
		AspnetUsers users = new Gson().fromJson(json, new TypeToken<AspnetUsers>() {
		}.getType());
		UserDataShare share = new UserDataShare(context);
		share.saveUserData(users);
		return users;
	}
	/**
	 * 保存登录用户名密码
	 * 
	 * @return
	 */
	public void saveLoginInfo(String name, String pwd) {
		// 实例化SharedPreferences.Editor对象（第二步）
		SharedPreferences.Editor editor = haredPreferences.edit();
		// 用putString的方法保存数据
		editor.putString(NAME, name);
		editor.putString(PWD, pwd);
//		editor.putInt(USERID, Integer.parseInt(userId));
		editor.putBoolean(ISLOGIN, true);
		// 提交当前数据
		editor.commit();
	}

	/**
	 * 读取登录用户名密码
	 * 
	 * @return
	 */
	public String[] getLoginInfo() {
		// 使用getString方法获得value，注意第2个参数是value的默认值
		String name = haredPreferences.getString(NAME, "");
		String pwd = haredPreferences.getString(PWD, "");
		if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(pwd)) {
			return new String[] { name, pwd};
		} else {
			return null;
		}
	}

	/**
	 * 获取登录用户信息
	 * 
	 * @return
	 */
	public AspnetUsers getUserData() {
		AspnetUsers info = null;
		if (isLogin()) {
			info = new AspnetUsers();
			info.setEmail(haredPreferences.getString("email", ""));
			info.setUserName(haredPreferences.getString("userName", ""));
			info.setGender(haredPreferences.getInt("gender", 0));
			info.setHead(haredPreferences.getString("head", ""));
			int userId = haredPreferences.getInt("userId", 0);
			info.setUserId(userId);

			UserToken token = new UserToken();
			token.setAccountToken(haredPreferences.getString("accountToken",""));
			info.setUserToken(token);

			AspnetMembers member = new AspnetMembers();
			member.setReferralUserId(haredPreferences.getInt("referralUserId", 0));
			member.setTopRegionId(haredPreferences.getInt("topRegionId", 0));
			member.setRegionId(haredPreferences.getInt("regionId", 0));
			member.setRealName(haredPreferences.getString("realName", ""));
			member.setAddress(haredPreferences.getString("address", ""));
			member.setZipcode(haredPreferences.getString("zipcode", ""));
			member.setTelPhone(haredPreferences.getString("telPhone", ""));
			member.setCellPhone(haredPreferences.getString("cellPhone", ""));
			member.setQq(haredPreferences.getString("qq", ""));
			member.setWangwang(haredPreferences.getString("wangwang", ""));
			member.setMsn(haredPreferences.getString("msn", ""));
			info.setAspnetMembers(member);
//			Contents.setUser(info);
		}
		return info;
	}

	/**
	 * 保存登录用户信息
	 * 
	 * @param info
	 */
	public void saveUserData(AspnetUsers info) {
		// 实例化SharedPreferences.Editor对象（第二步）
		SharedPreferences.Editor editor = haredPreferences.edit();
		// 用putString的方法保存数据
		editor.putString("email", info.getEmail());
		editor.putString("userName", info.getUserName());
		editor.putInt("gender", info.getGender());
		editor.putInt("userId", info.getUserId());
		editor.putString("head", info.getHead());

		editor.putString("accountToken", info.getUserToken().getAccountToken());
		editor.putString("tokenRemark", info.getUserToken().getTokenRemark());

		editor.putInt("referralUserId",info.getAspnetMembers().getReferralUserId());
		editor.putInt("topRegionId", info.getAspnetMembers().getTopRegionId());
		editor.putInt("regionId", info.getAspnetMembers().getRegionId());
		editor.putString("realName", info.getAspnetMembers().getRealName());
		editor.putString("address",info.getAspnetMembers().getAddress());
		editor.putString("zipcode",info.getAspnetMembers().getZipcode());
		editor.putString("telPhone",info.getAspnetMembers().getTelPhone());
		editor.putString("cellPhone",info.getAspnetMembers().getCellPhone());
		editor.putString("qq",info.getAspnetMembers().getQq());
		editor.putString("wangwang",info.getAspnetMembers().getWangwang());
		editor.putString("msn", info.getAspnetMembers().getMsn());
		editor.putBoolean(ISLOGIN, true);
		// 提交当前数据
		editor.commit();
//		Contents.setUser(info);
		BroadcastUtils.sendUserLogin(context);
	}

	/**
	 * 是否登录
	 * 
	 * @return
	 */
	public boolean isLogin() {
		return haredPreferences.getBoolean(ISLOGIN, false);
	}

	/**
	 * 用戶退出登录
	 */
	public void logout() {
//		Contents.setUser(null);
		// 实例化SharedPreferences.Editor对象（第二步）
		SharedPreferences.Editor editor = haredPreferences.edit();
		editor.putBoolean(ISLOGIN, false);
		// 提交当前数据
		editor.commit();
		BroadcastUtils.sendUserLogout(context);
	}

	@Override
	public void onSharedPreferenceChanged(SharedPreferences arg0, String arg1) {
		if (listener != null) {
			listener.update(arg0, arg1);
		}
	}
}
