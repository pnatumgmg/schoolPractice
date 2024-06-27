package print4_2.questions03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("入力:");
		int x = sc.nextInt() + 1;
		sc.close();
		
		for (int i = 1 ; i < x; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
