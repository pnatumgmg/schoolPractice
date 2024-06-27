package print3_2.questions12;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("入力:");
			double x = sc.nextDouble();
			sum += x;
		}
		
		sc.close();
		System.out.println(sum/5);
	}

}
