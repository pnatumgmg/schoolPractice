package print2_2.questions08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("受験者番号を入力：");
		int number = sc.nextInt();
		sc.close();
		
		switch (number) {
		case 1105 -> System.out.printf("%1d 番は合格です。",number);
		case 1200 -> System.out.printf("%1d 番は合格です。",number);
		case 1311 -> System.out.printf("%1d 番は合格です。",number);
		default -> System.out.printf("%1d 番は不合格です。",number);
		}
	}

}
