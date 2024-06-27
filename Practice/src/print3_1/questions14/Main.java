package print3_1.questions14;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("入力値:");
		String input = sc.nextLine();
		sc.close();

		switch (input) {
		case "upcount" ->{
			for (int i = 1; i < 11; i++) {
				System.out.println(i);
			}
		}
		case "downcount" ->{
			for (int i = 10; i > 0; i--) {
				System.out.println(i);
			}
		}
		default ->{
			System.out.println("入力値が不正です。");
		}
		}
	}

}
