package print2_1.questions03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("整数値を入力：");
		int a = sc.nextInt();
		System.out.print("整数値を入力：");
		int b = sc.nextInt();
		sc.close();
		
		if (a == b) {
			System.out.println("a とb の値は等しいです。");
		} else if (a > b) {
			System.out.println("a はb より大きいです。");
		} else {
			System.out.println("a はb より小さいです。");
		}
	}

}
