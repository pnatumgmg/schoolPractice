package print4_1.questions06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;

		do {
			System.out.print("入力してください(y/n):");
			s = sc.nextLine();
		}while(!(s.equals("y") || s.equals("n")));
		
		System.out.println("プログラムを終了します");
		sc.close();
	}

}
