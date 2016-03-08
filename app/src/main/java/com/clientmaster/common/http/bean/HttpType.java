package com.clientmaster.common.http.bean;

public enum HttpType {
	NORMAL(null), JPG("image/jpeg"), PNG("image/png"), JPEG("image/jpeg"), MP3("audio/mpeg"), MP4("video/mp4"), OTHER("");
	
	private String value;

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	private HttpType(String value) {
		this.value = value;
	}

}
