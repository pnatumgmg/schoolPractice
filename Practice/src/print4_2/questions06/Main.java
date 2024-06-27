package print4_2.questions06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choise;
		do {
			System.out.print("入力してください（y/n）:");
			choise = sc.nextLine();
		}while(!(choise.equals("y") || choise.equals("n")));
		
		sc.close();
		System.out.println("プログラムを終了します。");
	}

}
