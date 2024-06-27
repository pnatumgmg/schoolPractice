package print4_1.questions07;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		String def = "あなたの運勢は";
		boolean neko = false;
		boolean re_start = true;

		do {int x = rand.nextInt(4);
		switch (x) {
		case 0 ->{
			System.out.println(def + "凶です。");
		}
		case 1 ->{
			System.out.println(def + "吉です");
		}
		case 2 ->{
			System.out.println(def + "中吉です");
		}
		case 3 ->{
			System.out.println(def + "大吉です");
		}
		}
		do {
			System.out.print("再度おみくじを行いますか？(y/n):");
			String choise = sc.nextLine();
			switch (choise) {
			case "y" ->{
				neko = false;
			}
			case "n" ->{
				re_start = false;
				neko = false;
				System.out.println("おみくじを終了します。");;
			}
			default ->{
				neko = true;
				System.out.println("入力が不正です。");
			}
			}
		}while(neko);
		}while(re_start);
		sc.close();
	}

}
