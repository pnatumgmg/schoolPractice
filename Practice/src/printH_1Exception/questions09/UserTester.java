package printH_1Exception.questions09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserTester {
	public static void main(String[] args) {
		User u;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("idを入力：");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("名前を入力：");
			String name = sc.nextLine();
			try{
				u = new User(number,name);
				break;
			}catch(IllegalArgumentException e) {
				System.out.println("もう一度入力してください\n");
			}
		}
		
		System.out.println(u + "\n");
		
		while(true) {
			System.out.print("年齢を入力：");
			try {
				u.setAge(sc.nextInt());
				break;
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("数値以外の値が入力されました");
				System.out.println("もう一度入力してください\n");
			}catch(IllegalArgumentException e) {
				System.out.println("もう一度入力してください\n");
			}
		}
		
		System.out.println("年齢：" + u.getAge());
		
	}

}
