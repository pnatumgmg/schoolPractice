package print6_1.questions07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("数値を入力！！：");
		double a = sc.nextDouble();
		System.out.print("数値を入力！！：");
		double b = sc.nextDouble();
		sc.close();
		
		double neko = getMinValue(a,b);
		System.out.println(neko + "が小さいよ！！");
	}
	
	static double getMinValue(double a , double b) {
		return a < b ? a : b;
	}

}
