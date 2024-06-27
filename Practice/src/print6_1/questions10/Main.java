package print6_1.questions10;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("配列の数を入力してください:");
		int n = sc.nextInt();
		sc.close();
		double[] double_arry = getAry(n);
		double ave = getAverage(double_arry);
		System.out.println("平均値は%fです".formatted(ave));
	}
	
	public static double getAverage(double[] arry) {
		double add = 0;
		for (int i = 0; i < arry.length; i++)
			add += arry[i];
		return add / arry.length;
	}

	public static void printAry(double[] d) {
		for (int i = 0; i < d.length; i++) {
			System.out.println("乱数値は%fです".formatted(d[i]));
		}
	}
	
	public static double[] getAry(int a) {
		double[] double_arry = new double[a];
		Random rand = new Random();
		for (int i = 0; i < double_arry.length; i++)
			double_arry[i] = rand.nextDouble();
		printAry(double_arry);
		
		return double_arry;
	}
	
}