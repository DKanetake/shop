package model;

//ログイン情報を表す
public class Login {
	private String userID;
	private String pass;
	
	public Login(String userID, String pass) {
		this.userID = userID;
		this.pass = pass;
	}

	public String getUserID() {
		return userID;
	}

	public String getPass() {
		return pass;
	}
	

}
