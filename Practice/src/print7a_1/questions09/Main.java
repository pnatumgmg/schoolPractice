package print7a_1.questions09;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("郵便番号を入力してください:");
		String post_cord = sc.nextLine();
		sc.close();
		
		if (post_cord.matches("^[0-9]{3}-[0-9]{4}$"))
			System.out.println("郵便番号です");
		else
			System.out.println("郵便番号ではありません");
	}

}
