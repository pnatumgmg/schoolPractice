package print4_2.questions04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("入力:");
		int x = sc.nextInt();
		sc.close();
		
		for (int i = x ; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
