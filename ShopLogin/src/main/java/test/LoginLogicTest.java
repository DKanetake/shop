package test;

import model.Login;
import model.LoginLogic;

public class LoginLogicTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		testExecuteOK();
		testExecuteNG();

	}
	
	public static void testExecuteOK() {
		Login login = new Login("tarou","1234");
		LoginLogic bo = new LoginLogic();
		boolean result = bo.execute(login);
		
		if(result) {
			System.out.println("testOK:成功しました");
		}else {
			System.out.println("testNG:失敗しました");
		}
	}
	
	public static void testExecuteNG() {
		Login login = new Login("tarou","12345");
		LoginLogic bo = new LoginLogic();
		boolean result = bo.execute(login);
		
		if(!result) {
			System.out.println("testNG:成功しました");
		}else {
			System.out.println("testNG:失敗しました");
		}
	}

}
