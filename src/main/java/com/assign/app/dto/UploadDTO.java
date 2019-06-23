package com.assign.app.dto;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class UploadDTO implements Serializable {
	
	private String email;
	private long pin;
	private String url;
//	private MultipartFile file;
	
	public UploadDTO() {
		System.out.println("created:"+this.getClass().getSimpleName());
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
//	public MultipartFile getFile() {
//		return file;
//	}
//	
//	public void setFile(MultipartFile file) {
//		this.file = file;
//	}
	
	@Override
	public String toString() {
		return "UploadDTO [email=" + email + ", pin=" + pin + ", url=" + url + "]";
	}
	
	
	

}
