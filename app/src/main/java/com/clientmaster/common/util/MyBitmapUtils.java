package com.clientmaster.common.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import android.view.View;

import com.clientmaster.R;
import com.lidroid.xutils.BitmapUtils;

public class MyBitmapUtils {
	private BitmapUtils bitmapUtils = null;
	private static MyBitmapUtils myBitmapUtils = null ;
	private static final String SDPATH = Environment
			.getExternalStorageDirectory().toString() + "/HoSa/";

	public MyBitmapUtils(Context context) {
		// TODO Auto-generated constructor stub
			bitmapUtils = new BitmapUtils(context, SDPATH);
			bitmapUtils.configDefaultLoadingImage(R.mipmap.icon_dault_img);// 默认背景图片
			bitmapUtils.configDefaultLoadFailedImage(R.mipmap.icon_dault_img);// 加载失败图片
			bitmapUtils.configDefaultBitmapConfig(Bitmap.Config.RGB_565);// 设置图片压缩类型
	}

	public static MyBitmapUtils getIntence(Context context) {
		// TODO Auto-generated method stub
		if(myBitmapUtils==null)
		{
			return new MyBitmapUtils(context) ;
		}
		return myBitmapUtils ;
	}

	// 加载网络图片
	// bitmapUtils.display(mImageView, mList.get(position));
	//
	// // 加载本地图片(路径以/开头， 绝对路径)
	// bitmapUtils.display(mImageView, "/sdcard/test.jpg");
	//
	// // 加载assets中的图片(路径以assets开头)
	// bitmapUtils.display(mImageView, "assets/img/wallpaper.jpg");
	/**
	 * 加载图片
	 * 
	 * @param view
	 * @param url
	 */
	public void loadUrl(View view, String url) {
		bitmapUtils.display(view, url);
	}
}
