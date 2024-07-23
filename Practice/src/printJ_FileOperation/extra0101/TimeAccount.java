package printJ_FileOperation.extra0101;

public class TimeAccount extends Account{
	private int timeBalance;
	
	public TimeAccount(String name,int balance,int timeBalance,int AccountNum) {
		super(name,balance,AccountNum);
		setTimeBalance(timeBalance);
	}
	
	public TimeAccount(String name,int balance,int timeBalance) {
		super(name,balance);
		setTimeBalance(timeBalance);
	}

	public int getTimeBalance() {
		return timeBalance;
	}

	public void setTimeBalance(int timeBalance) {
		this.timeBalance = timeBalance;
	}
	
	public void cancel() {
		this.setBalance(this.getBalance() + this.getTimeBalance());
		this.setTimeBalance(0);
	}
	
	@Override
	public void show() {
		System.out.println("口座名義：%s\n口座番号：%d\n預金残高%d\n定期預金残高%d\n"
				.formatted(this.getName(),this.getAccountNum()
						,this.getBalance(),this.getTimeBalance()));

	}
}