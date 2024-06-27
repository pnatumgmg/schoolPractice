package print9_bank_1;

import java.util.Scanner;

/**
 * 【上記2つのクラスを利用するクラス】
 */
public class AccountTester {
	public static void main(String[] args) {
		//4-1
		Account[] person = new Account[3];
		//4-2
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < person.length; i++) {
			System.out.print("口座名義を入力してください:");
			String name = sc.nextLine();
			System.out.print("口座番号を入力してください:");
			String num = sc.nextLine();
			System.out.print("預金額を入力してください:");
			int balance = sc.nextInt();
			System.out.print("口座作成年を入力してください:");
			int year = sc.nextInt();
			System.out.print("口座作成月を入力してください:");
			int month = sc.nextInt();
			System.out.print("口座作成日を入力してください:");
			int day = sc.nextInt();
			sc.nextLine();
			person[i] = new Account(name, num, balance, year, month, day);
			System.out.println();
		}
		sc.close();
		
		/**4-3
		 * 配列person の中身を拡張for文を用いて全件表示する
		 */
		for (Account s :person) {
			s.showAccount();
		}
		
		//4-4
		person[0].deposit(1000);
		
		//4-5
		person[1].withdraw(500);
		
		//4-6
		person[2].setCreateDate(2000, 10, 20);
		
		//4-7
//		System.out.println("%sの預金額は%d円です".formatted
//				(person[0].getName(),person[0].getBalance()));
		
		person[0].plusAlpha();
		
		//4-8
//		System.out.println("%sの預金額は%d円です".formatted
//				(person[1].getName(),person[1].getBalance()));
		
		person[1].plusAlpha();
		
		//4-9
		person[2].getCreateData().showCreateData();;
		
		
	}

}
