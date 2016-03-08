package com.clientmaster.common.http.bean;

@SuppressWarnings("serial")
public class RadiumListBaseBean<T> extends BaseBean{
	
	/**
	 * @Description:
	 * @author:lihy
	 */
//	private static final long serialVersionUID = 9170421990267378298L;

	/**
	 * 接口是否调用成功
	 */
//	private Boolean success;
	
	private String total;

	/**
	 * 提示信息
	 */
//	private String msg;
	
	/**
	 * 接口返回数据
	 */
	private T rows;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public T getRows() {
		return rows;
	}

	public void setRows(T rows) {
		this.rows = rows;
	}
	
	

}
