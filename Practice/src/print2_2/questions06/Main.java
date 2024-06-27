package print2_2.questions06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("整数値a を入力：");
		int a = sc.nextInt();
		int max = a;
		int min = a;
		
		System.out.println("整数値b を入力：");
		int b = sc.nextInt();
		if (max < b)
			max = b;
		if (min > b)
			min = b;
		
		System.out.println("整数値c を入力：");
		int c = sc.nextInt();
		if (max < c)
			max = c;
		if (min > c)
			min = c;
		
		System.out.printf("最大値：%1d\n",max);
		System.out.printf("最小値：%1d",min);
		sc.close();
	}

}
