package org.prasad.tutorials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

	private AccountDAO accountDAO;
	
	@Autowired
	public void setAccountDao(AccountDAO accountDao) {
		this.accountDAO = accountDao;
	}

	public void transferMoney(long sourceAccountId, long targetAccountId, double amount) {
		Account sourceAccount = accountDAO.find(sourceAccountId);
		Account targetAccount = accountDAO.find(targetAccountId);
		sourceAccount.setBalance(sourceAccount.getBalance() - amount);
		targetAccount.setBalance(targetAccount.getBalance() + amount);
		accountDAO.update(sourceAccount);
		accountDAO.update(targetAccount);
	}

	public void depositMoney(long accountId, double amount) throws Exception {
		Account account = accountDAO.find(accountId);
		account.setBalance(account.getBalance() + amount);
		accountDAO.update(account);
	}

	public Account getAccount(long accountId) {
		return accountDAO.find(accountId);
	}
	
	
}
