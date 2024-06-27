package print3_1.questions12;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("入力：");
			double s = sc.nextDouble();
			total += s;
		}
		sc.close();
		double ans = total / 5;
		System.out.println("平均:" + ans);
	}

}