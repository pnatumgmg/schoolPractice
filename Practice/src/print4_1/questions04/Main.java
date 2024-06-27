package print4_1.questions04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("入力:");
		int h = sc.nextInt();
		System.out.println("");
		sc.close();
		
		for (int i = h; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
//		System.out.println("");
	}
}