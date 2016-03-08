package com.clientmaster.common.http.listener;

/**
 * 
 * @Description:线程监听类
 * @author:lihy
 * @time:2015-2-12 下午1:19:07
 */
public interface TaskListener<T> {
	public void onStart();
	public void onStop(boolean isNoNet);
	public void onFinish(T result) throws Exception;
}
