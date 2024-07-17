package printH_1Exception.questions04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("整数を入力してください。");
		
		while(true) {
			try {
				number = Integer.parseInt(sc.nextLine());
				break;
			}catch(NumberFormatException e) {
				System.out.println("整数値ではありません");
				System.out.println("もう一度入力してください。");
			}
		}
		
		sc.close();
		
		System.out.println("入力された整数は%dです。"
				.formatted(number));
		
	}

}
