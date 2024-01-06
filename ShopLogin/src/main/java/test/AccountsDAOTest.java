package test;

import dao.AccountsDAO;
import model.Account;
import model.Login;

public class AccountsDAOTest {
	
	public static void main(String[] args) {
		testFindByLoginOK();
		testFindByLoginNG();

	}
	
	public static void testFindByLoginOK() {
		Login login = new Login("tarou" , "1234");
		AccountsDAO dao = new AccountsDAO();
		Account result = dao.findByLogin(login);
		
		if(result != null && 
			result.getUserID().equals("tarou") &&
			result.getPass().equals("1234") &&
			result.getMail().equals("tarou.yamada@miyabilink.jp") &&
			result.getName().equals("山田 太郎") &&
			result.getAge() == 23) {
			
			System.out.println("testOK:成功しました");
		}else {
			System.out.println("testOK:失敗しました");
		}
	}
	
	public static void testFindByLoginNG() {
		Login login = new Login("tarou", "12345");
		AccountsDAO dao = new AccountsDAO();
		Account result = dao.findByLogin(login);
		
		if(result == null) {
			System.out.println("testNG:成功しました");
		}else {
			System.out.println("testNG:失敗しました");
		}
	}

}
