package print4_2.questions10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("入力:");
		int count = sc.nextInt();
		
		for (int i = count; i > 0; i--) {
			for (int j = 0; j < count; j++) {
				if (count - j > i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
