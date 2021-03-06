package com.clientmaster.common.http.utils;

import java.io.FilterOutputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;

import org.apache.http.HttpResponse;

import android.content.Context;

import com.clientmaster.common.http.bean.HttpPair;


/**
 * 
 * @Description:网络模块外部调用入口
 * @author:lihy
 * @time:2015-2-11 上午9:49:53
 */
public class HttpHelper {
	private HttpUtil httpUtil;
	private static HttpHelper self;

	public HttpHelper(Context context) {
		httpUtil = new HttpUtil(context);
	}

	public static HttpHelper getInstance(Context context) {
		if (self == null) {
			self = new HttpHelper(context);
		}
		return self;
	}

	/**
	 * 
	 * @Title: get
	 * @Description:get请求
	 * @param @param context
	 * @param @param url
	 * @param @param para
	 * @param @param cls
	 * @param @return 设定文件
	 * @return T 返回类型
	 * @throws
	 */
	public <T> T get(String url, ArrayList<HttpPair> para, Type cls) {
		return httpUtil.get(url, para, cls);
	}

	/**
	 * 
	 * @Title: get
	 * @Description: get请求
	 * @param @param context
	 * @param @param url
	 * @param @param para
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	public String get(String url, ArrayList<HttpPair> para) {
		return httpUtil.get(url, para);
	}

	/**
	 * 
	 * @Title: getResponse
	 * @Description: get请求
	 * @param @param context
	 * @param @param url
	 * @param @param para
	 * @param @return 设定文件
	 * @return HttpResponse 返回类型
	 * @throws
	 */
	public HttpResponse getResponse(String url, ArrayList<HttpPair> para) {
		return httpUtil.getResponse(url, para);
	}

	/**
	 * 
	 * @Title: post
	 * @Description: post请求
	 * @param @param context
	 * @param @param url
	 * @param @param para
	 * @param @param cls
	 * @param @param mStream
	 * @param @return 设定文件
	 * @return T 返回类型
	 * @throws
	 */
	public <T> T post(String url, ArrayList<HttpPair> para, Type cls, FilterOutputStream mStream) {
		return httpUtil.post(url, para, cls, mStream);
	}

	/**
	 * 
	 * @Title: post
	 * @Description: post请求
	 * @param @param context
	 * @param @param url_Str
	 * @param @param pairs
	 * @param @param mStream
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	public String post(String url_Str, ArrayList<HttpPair> pairs, FilterOutputStream mStream) {
		return httpUtil.post(url_Str, pairs, mStream);
	}

	/**
	 * 
	 * @Title: postResponse
	 * @Description: Post请求
	 * @param @param context
	 * @param @param url_Str
	 * @param @param pairs
	 * @param @param mStream
	 * @param @return 设定文件
	 * @return HttpResponse 返回类型
	 * @throws
	 */
	public HttpResponse postResponse(String url_Str, ArrayList<HttpPair> pairs, final FilterOutputStream mStream) {
		return httpUtil.postResponse(url_Str, pairs, mStream);
	}
}
