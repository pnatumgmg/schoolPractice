package printI_1.questions02;

import java.util.ArrayList;
import java.util.Collections;



public class Main {
	public static void main(String[] args) {
		ArrayList<Account> aa = new ArrayList<Account>();
		
		Account c = new Account(1,"Charlie",10000);
		Account b = new Account(2,"Bob",5000);
		Account j = new Account(5,"John",7000);
		Account a = new Account(4,"Alice",3000);
		
		aa.add(c);
		aa.add(b);
		aa.add(j);
		aa.add(a);
		
//		AccountComparator pp = new AccountComparator(0);
		
		Collections.sort(aa,new AccountComparator());
		
		show(aa);
		
		Collections.reverse(aa);
		
		show(aa);
		
	}
	
	static void show(ArrayList<Account> aa) {
		for(int i = 0;i < aa.size();i++) {
			System.out.println("%s 口座残高:%d"
					.formatted(aa.get(i).getName(),aa.get(i).getBalance()));
		}
	}

}
