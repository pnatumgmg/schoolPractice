package printJ_FileOperation.extra0101;

import java.util.ArrayList;

public class Account {
	String name;
	int balance;
	static int counter;
	int accountNum;
	
	public Account(String name,int balance,int accountNum){
		this(name,balance);
		setAccountNum(accountNum);
		if(counter < accountNum) {
			setCounter(accountNum);
		}
	}
	
	public Account(String name,int balance) {
		setName(name);
		setBalance(balance);
		counter++;
		setAccountNum(counter);
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Account.counter = counter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	
	public void deposit(int deposit) {
		if(deposit < 0) {
			System.out.println("0以下の金額は扱えません");
		}else {
			this.setBalance(this.getBalance() + deposit);
		}
	}
	
	public void withdraw(int withdraw) {
		if(withdraw < 0) {
			System.out.println("0以下の金額は扱えません");
		}else {
			if(chkMoney(this,withdraw)) {
				this.setBalance(this.getBalance() - withdraw);
			}else {
				System.out.println("%sの貯金残高が不足しています"
						.formatted(getName()));
			}
		}
	}
	
	public void show() {
		System.out.println("口座名義：%s\n口座番号：%d\n預金残高%d\n"
				.formatted(this.getName(),this.getAccountNum(),this.getBalance()));
	}
	
	public static void transfer(Account b1,Account b2,int money) {
		if(money < 0) {
			System.out.println("0以下の金額は扱えません");
		}else {
			if(chkMoney(b1,money)) {
				b1.withdraw(money);
				b2.deposit(money);
			}else {
				System.out.println("%sの貯金残高が不足しています"
						.formatted(b1.getName()));
			}
		}
	}
	
	public static boolean chkMoney(Account b1,int money) {
		if(b1.getBalance() > money) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int chkAccountNum(ArrayList<Account> aa,int a) {
		Account a1 = newAccount.cAccount(a);
		return aa.indexOf(a1);
//		int count = 0;
//		for(Account ac:aa) {
//			if(ac.getAccountNum() == a) {
//				return count;
//			}
//			count ++;
//		}
//		return -1;
	}
	
	@Override
	public boolean equals(Object object) {
		if(object instanceof Account a) {
			if(this.getAccountNum() == a.getAccountNum()) {
				return true;
			}
		}
		
		return false;
	}
	
}

class newAccount{
	public static Account cAccount(int a) {
		Account a1 = new Account("check",0,a);
		return a1;
	}
}
