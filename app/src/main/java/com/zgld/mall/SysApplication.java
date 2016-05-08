package com.zgld.mall;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.StrictMode;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.android.volley.VolleyLog;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;
import com.nostra13.universalimageloader.utils.L;
import com.zgld.mall.activity.ImageBrowserActivity;
import com.zgld.mall.activity.LoadActivity;
import com.zgld.mall.utils.Contents;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SysApplication extends Application implements Thread.UncaughtExceptionHandler {
	private static final String TAG = "SysApplication";
	static DisplayImageOptions options; // DisplayImageOptions是用于设置图片显示的类
	static DisplayImageOptions optionsUser;
	static DisplayImageOptions optionsProduct;
	public static ImageLoader imageLoaderCache = ImageLoader.getInstance();
	public static Context applicationContext;
	// login user name
	public final String PREF_USERNAME = "username";

	/**
	 * 当前用户nickname,为了苹果推送不是userid而是昵称
	 */
	public static String currentUserNick = "";

	@TargetApi(Build.VERSION_CODES.GINGERBREAD)
	@SuppressWarnings("unused")
	@Override
	public void onCreate() {
		super.onCreate();
		//关闭volley日志
//		VolleyLog.DEBUG = false;
		Thread.setDefaultUncaughtExceptionHandler(this);
		applicationContext = this;
		boolean DEVELOPER_MODE = false;
		if (DEVELOPER_MODE && Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
			StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyDialog().build());
			StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyDeath().build());
		}

		super.onCreate();

		initImageLoader(getApplicationContext());
		//关闭nostra13.universalimageloader日志
		L.disableLogging();
		// 使用DisplayImageOptions.Builder()创建DisplayImageOptions
		options = new DisplayImageOptions.Builder().showStubImage(R.drawable.no_shortcut_icon) // 设置图片下载期间显示的图片
				.showImageForEmptyUri(R.drawable.no_shortcut_icon) // 设置图片Uri为空或是错误的时候显示的图片
				.showImageOnFail(R.drawable.no_shortcut_icon) // 设置图片加载或解码过程中发生错误显示的图片
				.cacheInMemory(true) // 设置下载的图片是否缓存在内存中
				.cacheOnDisc(true) // 设置下载的图片是否缓存在SD卡中
				.displayer(new RoundedBitmapDisplayer(0)) // 设置成圆角图片
				.bitmapConfig(Bitmap.Config.ARGB_8888)
				.imageScaleType(ImageScaleType.NONE)
				.build(); // 创建配置过得DisplayImageOption对象
		optionsUser = new DisplayImageOptions.Builder().showStubImage(R.drawable.default_avatar) // 设置图片下载期间显示的图片
				.showImageForEmptyUri(R.drawable.default_avatar) // 设置图片Uri为空或是错误的时候显示的图片
				.showImageOnFail(R.drawable.default_avatar) // 设置图片加载或解码过程中发生错误显示的图片
				.cacheInMemory(true) // 设置下载的图片是否缓存在内存中
				.cacheOnDisc(true) // 设置下载的图片是否缓存在SD卡中
				.displayer(new RoundedBitmapDisplayer(0)) // 设置成圆角图片
				.bitmapConfig(Bitmap.Config.ARGB_8888)
				.build(); // 创建配置过得DisplayImageOption对象
		optionsProduct = new DisplayImageOptions.Builder().showStubImage(R.drawable.no_shortcut_icon) // 设置图片下载期间显示的图片
				.showImageForEmptyUri(R.drawable.no_shortcut_icon) // 设置图片Uri为空或是错误的时候显示的图片
				.showImageOnFail(R.drawable.no_shortcut_icon) // 设置图片加载或解码过程中发生错误显示的图片
				.cacheInMemory(true) // 设置下载的图片是否缓存在内存中
				.cacheOnDisc(true) // 设置下载的图片是否缓存在SD卡中
				.displayer(new RoundedBitmapDisplayer(0)) // 设置成圆角图片
				.bitmapConfig(Bitmap.Config.ARGB_8888)
				.build(); // 创建配置过得DisplayImageOption对象

        instance = this;
	}

	public static void initImageLoader(Context context) {
		// This configuration tuning is custom. You can tune every option, you
		// may tune some of them,
		// or you can create default configuration by
		// ImageLoaderConfiguration.createDefault(this);
		// method.
		ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context)
				.threadPriority(Thread.NORM_PRIORITY - 2)
				.denyCacheImageMultipleSizesInMemory()
				.discCacheFileNameGenerator(new Md5FileNameGenerator())
				.tasksProcessingOrder(QueueProcessingType.LIFO)
				.writeDebugLogs() 
				.build();
		// Initialize ImageLoader with configuration.
		ImageLoader.getInstance().init(config);
	}

	@Override
	public void uncaughtException(Thread thread, Throwable ex) {
		// TODO Auto-generated method stub
//		ex.printStackTrace();
//		Intent intent = new Intent(getApplicationContext(), LoadActivity.class);
//		PendingIntent restartIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent,
//                Intent.FLAG_ACTIVITY_NEW_TASK);
//		AlarmManager mgr = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
//		mgr.set(AlarmManager.RTC, System.currentTimeMillis() + 500, restartIntent);
//		System.exit(0);
	}

	private static SysApplication instance;

	/**
	 * 单一实例
	 */
	public static SysApplication getInstance() {
		if (instance == null) {
			instance = new SysApplication();
		}
		return instance;
	}

	/**
	 * 显示图片
	 * 
	 * @param url
	 * @param imageView
	 */
	public static void DisplayImage(String url, ImageView imageView) {
		if(url.indexOf("http")>=0) {
			imageLoaderCache.displayImage(url, imageView, optionsProduct, animateFirstListener);
		}else{
			imageLoaderCache.displayImage(Contents.BASE_IMAGE_PATH + url, imageView, optionsProduct, animateFirstListener);
		}
	}

	/**
	 * 显示绝对路径图片
	 * 
	 * @param url
	 * @param imageView
	 */
	public static void DisplayAbstractImage(String url, ImageView imageView) {
		if(url.indexOf("http")>=0) {
			imageLoaderCache.displayImage(url, imageView, options, animateFirstListener);
		}else{
			imageLoaderCache.displayImage(Contents.BASE_IMAGE_PATH + url, imageView, options, animateFirstListener);
		}
	}

	/**
	 * 显示用户头像图片‘点击事件 onclick
	 * 
	 * @param url
	 * @param imageView
	 */
	public static void DisplayUserImageClick(final String url, ImageView imageView) {
		if(url.indexOf("http")>=0) {
			imageLoaderCache.displayImage(url, imageView, optionsUser, animateFirstListener);
		}else{
			imageLoaderCache.displayImage(Contents.BASE_IMAGE_PATH + url, imageView, optionsUser, animateFirstListener);
		}
		if (imageView != null) {
			imageView.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(applicationContext, ImageBrowserActivity.class);
					ArrayList<String> urls = new ArrayList<String>();
					urls.add(Contents.BASE_IMAGE_PATH + url);
					intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					intent.putStringArrayListExtra("urls", urls);
					applicationContext.startActivity(intent);
				}
			});
		}
	}

	/**
	 * 显示主页用户头像图片
	 * 
	 * @param url
	 * @param imageView
	 */
	public static void DisplayUserImage(final String url, ImageView imageView) {
		if(url.indexOf("http")>=0) {
			imageLoaderCache.displayImage(url, imageView, optionsUser, animateFirstListener);
		}else{
			imageLoaderCache.displayImage(Contents.BASE_IMAGE_PATH + url, imageView, optionsUser, animateFirstListener);
		}
	}

	private static ImageLoadingListener animateFirstListener = new AnimateFirstDisplayListener();

	/**
	 * 图片加载第一次显示监听器
	 * 
	 * @author Administrator
	 * 
	 */
	private static class AnimateFirstDisplayListener extends SimpleImageLoadingListener {

		static final List<String> displayedImages = Collections.synchronizedList(new LinkedList<String>());

		@Override
		public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
			if (loadedImage != null) {
				ImageView imageView = (ImageView) view;
				// 是否第一次显示
				boolean firstDisplay = !displayedImages.contains(imageUri);
				if (firstDisplay) {
					// 图片淡入效果
					FadeInBitmapDisplayer.animate(imageView, 500);
					displayedImages.add(imageUri);
				}
			}
		}
	}
}