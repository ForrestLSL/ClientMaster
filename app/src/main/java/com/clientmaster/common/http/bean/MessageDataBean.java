package com.clientmaster.common.http.bean;

public class MessageDataBean <T> extends BaseBean {
	/**
	 * @Description:
	 * @author:lihy
	 */
	private static final long serialVersionUID = 9170421990267378298L;

	/**
	 * 接口是否调用成功
	 */
	private Boolean success;

	/**
	 * 提示信息
	 */
	private String msg;
	/**
	 * 接口返回数据
	 */
	private T data;
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
