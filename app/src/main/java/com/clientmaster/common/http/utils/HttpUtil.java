package com.clientmaster.common.http.utils;

import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.content.Context;
import android.util.Log;

import com.clientmaster.common.http.bean.HttpPair;
import com.clientmaster.common.http.bean.HttpType;
import com.clientmaster.common.http.cokieutils.CookieUtil;
import com.clientmaster.common.util.MLog;
import com.clientmaster.common.util.StringUtil;
import com.google.gson.Gson;
import com.lidroid.xutils.http.client.multipart.MultipartEntity;
import com.lidroid.xutils.http.client.multipart.content.FileBody;
import com.lidroid.xutils.http.client.multipart.content.StringBody;

/**
 * 
 * @ClassName: HttpUtil
 * @Description: Http请求管理工具
 * @author lhy
 * @date 2014-10-9 上午11:16:46
 * 
 */
public class HttpUtil {
	
	private Context context;

	public HttpUtil(Context context) {
		this.context = context;
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
		Gson gson = new Gson();
		T t = null;
		try {
			t = gson.fromJson(get(url, para), cls);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
		return t;
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
		HttpResponse response = getResponse(url, para);
		if (response == null) {
			return null;
		}
		int statusCode = response.getStatusLine().getStatusCode();
		MLog.i("HttpStatus=>" + statusCode);
		// 判断请求是否成功
		if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
			String body = null;
			try {
				body = EntityUtils.toString(response.getEntity(), "utf-8");
				MLog.i("请求服务器端成功=>\n" + body);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return body;
		}
		return null;
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
		try {
			StringBuilder urlBuilder = new StringBuilder();
			urlBuilder.append(url);
			if (para != null) {
				urlBuilder.append("?");
				for (int i = 0; i < para.size(); i++) {
					HttpPair pair = para.get(i);
					urlBuilder.append(URLEncoder.encode(pair.getName(), "UTF-8")).append('=')
							.append(URLEncoder.encode(pair.getValue().toString(), "UTF-8"));
					urlBuilder.append('&');
				}
				urlBuilder.delete(urlBuilder.length() - 1, urlBuilder.length());
			}
			Log.i("getRequest=>", urlBuilder.toString());

			// 创建HttpClient对象
			DefaultHttpClient httpClient = new DefaultHttpClient();
			// 发送get请求创建HttpGet对象
			HttpGet httpget = new HttpGet(urlBuilder.toString());
			System.out.println(urlBuilder.toString());
			CookieUtil cookieStore = CookieUtil.getInstance(context);
			httpClient.setCookieStore(cookieStore);
			HttpResponse response = httpClient.execute(httpget);
			int statusCode = response.getStatusLine().getStatusCode();
			// 判断请求是否成功
			if (statusCode == HttpStatus.SC_OK) {
				cookieStore = CookieUtil.getInstance(context);
				List<Cookie> cookies = httpClient.getCookieStore().getCookies();
				for (Cookie cookie : cookies) {
					cookieStore.addCookie(cookie);
				}
			}
			return response;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
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
		Gson gson = new Gson();
		T t = null;
		try {
			t = gson.fromJson(post(url, para, mStream), cls);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
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
		HttpResponse httpResponse = postResponse(url_Str, pairs, mStream);
		if (httpResponse == null) {
			return null;
		}
		int statusCode = httpResponse.getStatusLine().getStatusCode();
		MLog.i("HttpStatus+>" + statusCode);
		if (statusCode == HttpStatus.SC_OK) {
			String body = null;
			try {
				body = EntityUtils.toString(httpResponse.getEntity());
				MLog.i("请求服务器端成功=>\n" + body);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return body.trim();
		}
		return null;
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
		try {
			MLog.i("Post请求URL->" + url_Str);
			// 判断是否包含上传文件
			boolean isUploadFile = false;
			HttpPost httpPost = new HttpPost(url_Str);
			MultipartEntity multipartEntity = new MultipartEntity() {
				@Override
				public void writeTo(OutputStream outstream) throws IOException {
					super.writeTo(new FilterOutputStream(outstream) {
						@Override
						public void write(byte[] buffer, int offset, int length) throws IOException {
							super.write(buffer, offset, length);
							if (mStream != null) {
								mStream.write(buffer, offset, length);
							}
						}
					});
				}
			};
			if (pairs != null) {
				for (int i = 0; i < pairs.size(); i++) {
					HttpPair httpPair = pairs.get(i);
					HttpType type = httpPair.getType();
					if (type != HttpType.NORMAL) {
						isUploadFile = true;
						break;
					}
				}
				for (int i = 0; i < pairs.size(); i++) {
					HttpPair multipleNameValuePair = pairs.get(i);
					HttpType type = multipleNameValuePair.getType();
					String key = multipleNameValuePair.getName().trim();
					String value = multipleNameValuePair.getValue().trim();
					MLog.i("上传参数type->" + type.getValue() + "\n" + "上传参数key->" + key + "\n" + "上传参数value->" + value);
				}
				if (isUploadFile) {
					for (int i = 0; i < pairs.size(); i++) {
						HttpPair multipleNameValuePair = pairs.get(i);
						HttpType type = multipleNameValuePair.getType();
						String key = multipleNameValuePair.getName().trim();
						String value = multipleNameValuePair.getValue().trim();
						// MLog.i("上传参数type->" + type.getValue() + "\n" +
						// "上传参数key->" + key + "\n" + "上传参数value->" + value);
						if (type != HttpType.NORMAL) {
							if (!StringUtil.isNullOrEmpty(value)) {
								multipartEntity.addPart(key, new FileBody(new File(value), type.getValue()));
							}
						} else {
							multipartEntity.addPart(key, new StringBody(value, Charset.forName("utf-8")));
						}
					}
					httpPost.setEntity(multipartEntity);
				} else {
					UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(pairs, "UTF-8");
					httpPost.setEntity(urlEncodedFormEntity);
				}
			}

			CookieUtil cookieStore = CookieUtil.getInstance(context);
			DefaultHttpClient httpClient = new DefaultHttpClient();
			httpClient.setCookieStore(cookieStore);
			// return httpClient.execute(httpPost);
			HttpResponse httpResponse = httpClient.execute(httpPost);
			int statusCode = httpResponse.getStatusLine().getStatusCode();
			if (statusCode == HttpStatus.SC_OK) {
				if (!isUploadFile) {
					cookieStore = CookieUtil.getInstance(context);
					List<Cookie> cookies = httpClient.getCookieStore().getCookies();
					for (Cookie cookie : cookies) {
						cookieStore.addCookie(cookie);
					}
				}
			}
			return httpResponse;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
