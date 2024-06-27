package print4_2.questions07;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		String next;
		String luck = "あなたの運勢は%1sです。";
		boolean neko = true;

		do {
			int r = rand.nextInt(4);
			switch (r) {
			case 0 -> System.out.printf(luck,"凶");
			case 1 -> System.out.printf(luck,"吉");
			case 2 -> System.out.printf(luck,"中吉");
			case 3 -> System.out.printf(luck,"大吉");

			}
			System.out.println();
			
			do {
				System.out.print("再度おみくじを行いますか？(y/n):");
				next = sc.nextLine();
				switch (next){
					case "y" -> neko = false;
					case "n" -> neko = false;
					default -> System.out.println("入力が不正です");
				}
			} while(neko);
		}while(next.equals("y"));
		System.out.println("おみくじを終了します。");
		sc.close();
	}

}
