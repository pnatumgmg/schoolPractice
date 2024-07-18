package printI_1.questions02;

public class Account {
	private int accountNum;
	private String name;
	private int balance;
	
	public Account(int accountNum,String name,int balance){
		this.setAccountNum(accountNum);
		this.setName(name);
		this.setBalance(balance);
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
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

}
