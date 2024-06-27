package print2_1.questions08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("受験者番号を入力：");
		int number = sc.nextInt();
		sc.close();
		
		switch (number) {
		case 1105, 1200, 1311 -> {
			System.out.println(number + " 番は合格です。");
		}
//		case 1200 ->{
//			System.out.println(number + " 番は合格です。");
//		}
//		case 1311 ->{
//			System.out.println(number + " 番は合格です。");
//		}
		default ->{
			System.out.println(number + " 番は不合格です。");
		}
		}
	}

}
