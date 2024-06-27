package print2_1.questions07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("受験者番号を入力：");
		int number = sc.nextInt();
		sc.close();
		
		if (number == 1105 || number ==1200  || number == 1311) {
			System.out.println(number + " 番は合格です。");;
//		}else if (number == 1200) {
//			System.out.println(number + " 番は合格です。");;
//		}else if (number == 1311) {
//			System.out.println(number + " 番は合格です。");;
		}else {
			System.out.println(number + " 番は不合格です。");
		}
	}

}
