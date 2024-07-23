package printI_1.questions02;

import java.util.Comparator;

public class AccountComparator implements Comparator<Account>{
//	private int check;
	@Override
	public int compare(Account o1, Account o2) {
		if(o1.getBalance() < o2.getBalance()) {
			return -1;
		}else if(o1.getBalance() > o2.getBalance()) {
			return 1;
		}else {
			return 0;
		}
		
	}
//	public AccountComparator(int check) {
//		this.check = check;
//	}
	
//	public int compare(Account o1, Account o2) {
//		if(check == 1) {
//			return Integer.compare(o1.getBalance(), o2.getBalance());
//		}else {
//			return Integer.compare(o1.getAccountNum(), o2.getAccountNum());
//		}
//	}
	
	

}
