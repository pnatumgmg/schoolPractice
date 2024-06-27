package print2_1.questions05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.print("入力：");
		int x = sc.nextInt();
		sc.close();
		
		if (x < 0) {
			System.out.println("０以下の値が入力されました。");
		} else if (0 == x % 2) {
			System.out.println("その値は偶数です。");
		} else {
			System.out.println("その値は奇数です。");
		}
	}

}
