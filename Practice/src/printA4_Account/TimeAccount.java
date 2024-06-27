package printA4_Account;

public class TimeAccount extends Account{
	int timeBalance;
	
	TimeAccount(String name,int no,int balance,int timeBalance){
		super(name,no,balance);
		setTimeBalance(timeBalance);
	}
	
	void setTimeBalance(int timeBalance) {
		this.timeBalance = timeBalance;
	}
	
	int getTimeBalance() {
		return this.timeBalance;
	}
	
	void cancel() {
		setBalance(getBalance() + getTimeBalance());
		setTimeBalance(0);
	}
	
	@Override
	void show() {
		super.show();
		System.out.println("現在の定期預金残高:%d"
				.formatted(getTimeBalance()));
	}
}
