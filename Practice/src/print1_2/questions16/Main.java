package print1_2.questions16;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("名前を入力：");
		String name = sc.nextLine();
		System.out.print("年齢を入力：");
		int age = sc.nextInt();
		
		System.out.printf("%1sさんの年齢は%2d 歳です。",name,age);
		sc.close();
	}

}
