package com.test.demoProject.dataObject;

public class User {
	private String _userName = "";
	private String _passWord = "";

	public User(String userName, String passWord) {
		this._userName = userName;
		this._passWord = passWord;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		this._userName = userName;
	}

	public String getPassWord() {
		return _passWord;
	}

	public void setPassWord(String passWord) {
		this._passWord = passWord;
	}
}
