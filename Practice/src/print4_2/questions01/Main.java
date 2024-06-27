package print4_2.questions01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("入力:");
			int x = sc.nextInt();
			if (max < x)	max = x;
			if (min > x)	min = x;
		}
		sc.close();
		
		System.out.printf("最小値は%1dです。\n",min);
		System.out.printf("最大値は%1dです",max);
	}

}
