package jp.co.internous.easylogin.model.domain;

public class MstUser {
	
	private int id;
	
	private String userName;
	
	private String password;
	
	private String fullName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void getPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void getFullName(String fullName) {
		this.fullName = fullName;
	}
	

}
