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
import com.zgld.mall.beans.UserProfile;
import com.zgld.mall.beans.UserToken;
import com.zgld.mall.beans.Users;
import com.zgld.mall.beans.YAccount;
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
	public YAccount updateUser(Message message) throws JSONException {
		JSONObject jsonObject = new JSONObject(message.getData().getString(Contents.JSON)).getJSONObject(Contents.DATA).getJSONObject(Contents.INFO);
		String json = jsonObject.toString();
		YAccount users = new Gson().fromJson(json, new TypeToken<YAccount>() {
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
	public YAccount getUserData() {
		YAccount info = null;
		if (isLogin()) {
			info = new YAccount();
			info.setAccountId(haredPreferences.getInt("accountId", 0));
			info.setRoleSetId(haredPreferences.getInt("roleSetId", 0));
			info.setUnitSetId(haredPreferences.getInt("unitSetId", 0));
			info.setAccountSex(haredPreferences.getInt("accountSex", 0));
			info.setAccountState(haredPreferences.getInt("accountState", 0));
			info.setAccountLeavel(haredPreferences.getInt("accountLeavel", 0));

			info.setAccountName(haredPreferences.getString("accountName", ""));
			info.setAccountRealName(haredPreferences.getString("accountRealName", ""));
			info.setAccountPassword(haredPreferences.getString("accountPassword", ""));
			info.setAccountHead(haredPreferences.getString("accountHead", ""));
			info.setAccountEmail(haredPreferences.getString("accountEmail", ""));
			info.setAccountMobile(haredPreferences.getString("accountMobile", ""));
			info.setAccountIntro(haredPreferences.getString("accountIntro", ""));

			int userId = haredPreferences.getInt("userId", 0);

			Users users = new Users();
			users.setUserId(haredPreferences.getInt("userId", 0));
			users.setUserAccountStatus(haredPreferences.getInt("userAccountStatus", 0));
			users.setUserType(haredPreferences.getInt("userType", 3));
			users.setAppUserToken(haredPreferences.getString("appUserToken", ""));
			users.setUserBankCard(haredPreferences.getString("userBankCard", ""));
			users.setUserId(userId);
			info.setUsers(users);

			UserProfile profile = new UserProfile();
			profile.setUserProfileId(haredPreferences.getInt("userProfileId", 0));
			profile.setPoints(haredPreferences.getInt("points", 0));
			profile.setRegionId(haredPreferences.getInt("regionId", 0));
			profile.setGender(haredPreferences.getInt("gender", 0));
			profile.setPublicToken(haredPreferences.getString("publicToken", ""));
			profile.setRealName(haredPreferences.getString("realName", ""));
			profile.setAddress(haredPreferences.getString("address", ""));
			profile.setQq(haredPreferences.getString("qq", ""));
			profile.setMsn(haredPreferences.getString("msn", ""));
			profile.setTelPhone(haredPreferences.getString("telPhone", ""));
			profile.setCellPhone(haredPreferences.getString("cellPhone", ""));
			profile.setBalance(Double.parseDouble(haredPreferences.getString("balance", "0")));
			profile.setDeductMoney(Double.parseDouble(haredPreferences.getString("deductMoney", "0")));
			profile.setUserId(userId);
			info.setUserProfile(profile);
//			Contents.setUser(info);
		}
		return info;
	}

	/**
	 * 保存登录用户信息
	 * 
	 * @param info
	 */
	public void saveUserData(YAccount info) {
		// 实例化SharedPreferences.Editor对象（第二步）
		SharedPreferences.Editor editor = haredPreferences.edit();
		// 用putString的方法保存数据
		editor.putInt("accountId",info.getAccountId());
		editor.putInt("roleSetId", info.getRoleSetId());
		editor.putInt("unitSetId", info.getUnitSetId());
		editor.putInt("accountSex", info.getAccountSex());
		editor.putInt("accountState", info.getAccountState());
		editor.putInt("accountLeavel", info.getAccountLeavel());
		editor.putString("accountName", info.getAccountName());
		editor.putString("accountRealName", info.getAccountRealName());
		editor.putString("accountPassword", info.getAccountPassword());
		editor.putString("accountHead", info.getAccountHead());
		editor.putString("accountEmail", info.getAccountEmail());
		editor.putString("accountMobile", info.getAccountMobile());
		editor.putString("accountIntro", info.getAccountIntro());

		if(info.getUsers()!=null) {
			editor.putInt("userId", info.getUsers().getUserId());
			editor.putInt("userAccountStatus", info.getUsers().getUserAccountStatus());
			editor.putInt("userType",info.getUsers().getUserType());
			editor.putString("appUserToken", info.getUsers().getAppUserToken());
			editor.putString("userBankCard", info.getUsers().getUserBankCard());
		}
		if(info.getUserProfile()!=null){
			editor.putInt("userProfileId", info.getUserProfile().getUserProfileId());
			editor.putInt("points", info.getUserProfile().getPoints());
			editor.putInt("regionId", info.getUserProfile().getRegionId());
			editor.putInt("gender", info.getUserProfile().getGender());
			editor.putString("publicToken", info.getUserProfile().getPublicToken());
			editor.putString("realName", info.getUserProfile().getRealName());
			editor.putString("address", info.getUserProfile().getAddress());
			editor.putString("qq", info.getUserProfile().getQq());
			editor.putString("msn", info.getUserProfile().getMsn());
			editor.putString("telPhone", info.getUserProfile().getTelPhone());
			editor.putString("cellPhone", info.getUserProfile().getCellPhone());
			editor.putString("balance", info.getUserProfile().getBalance()+"");
			editor.putString("deductMoney",info.getUserProfile().getDeductMoney()+"");
		}
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
