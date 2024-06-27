package print4_1.questions01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
//		System.out.println(max);
//		System.out.println(min);
		
		for (int i = 0; i < 5; i ++) {
			System.out.print("入力:");
			int x = sc.nextInt();
			if (x < min) {
				min = x;
			}
			if (x > max) {
				max = x;
			}
		}
		sc.close();
		System.out.println("最小値は" + min + "です。");
		System.out.println("最大値は" + max + "です。");
	}

}