package print4_1.questions03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("入力:");
		int h = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < (h + 1); i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
