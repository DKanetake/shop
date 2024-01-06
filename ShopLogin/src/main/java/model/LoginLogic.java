package model;

import dao.AccountsDAO;

//ログイン処理担当のBO
public class LoginLogic {
	public boolean execute(Login login) {
		AccountsDAO dao = new AccountsDAO();
		Account account = dao.findByLogin(login);
		return account != null;
	}

}