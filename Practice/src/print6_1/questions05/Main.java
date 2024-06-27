package print6_1.questions05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("aの値を入力:");
		double a = sc.nextDouble();
		System.out.print("bの値を入力:");
		double b = sc.nextDouble();
		System.out.print("cの値を入力:");
		double c = sc.nextDouble();
		sc.close();
		
		printMin(a,b,c);
	}
	
	public static void printMin(double a , double b , double c) {
		double min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		System.out.println("最小値は%fです".formatted(min));
	}
	
}
