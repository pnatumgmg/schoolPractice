package print4_1.questions10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("入力:");
		int count = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				if (i - j > 0) { 
				System.out.print(" ");
				}else
				System.out.print("*");
			}	
		System.out.println("");

		}

	}
}
