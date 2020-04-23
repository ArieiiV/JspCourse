package br.com.jsp.beans;

public class UserBean {

	private String user;
	private String password;

//	public boolean validaruserpassword(String password, String user) {
//		if(this.password==password && this.user==user) {
//			return true;
//		}else {
//			return false;
//		}
//	}

	public boolean validateCredentials(String password, String user) {
		if (user.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
			return true;
		} else {
			return false;
		}
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
