package print2_1.questions02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.print("整数値を入力:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		
		if (x > 5) {
			System.out.println("5 より大きい値です。");
		}else {
		System.out.println("5 以下の数値です。");
		}
		
	}

}
