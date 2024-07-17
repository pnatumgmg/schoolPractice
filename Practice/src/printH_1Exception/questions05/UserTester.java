package printH_1Exception.questions05;

import java.util.Scanner;

public class UserTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("idを入力：");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("名前を入力：");
			String name = sc.nextLine();
			try{
				User u = new User(number,name);
				break;
			}catch(IllegalArgumentException e) {
				System.out.println("もう一度入力してください\n");
			}
		}
	}

}
