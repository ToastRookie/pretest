package com.NHNENTER.ToastRookie.Model;

public class Board {
	String email;
	String password;
	String content;
	String date_created;
	String date_changed;
	String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}

	public String getDate_changed() {
		return date_changed;
	}

	public String getDate_created() {
		return date_created;
	}

	public String getEmail() {
		
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setDate_changed(String date_changed) {
		this.date_changed = date_changed;
	}

	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
