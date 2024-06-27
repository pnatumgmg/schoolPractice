package print1_2.questions15;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("名前を入力：");
		String name = sc.nextLine();
		sc.close();
		System.out.printf("猫の名前は%2sです。",name);
	}

}
