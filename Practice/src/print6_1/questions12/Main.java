package print6_1.questions12;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		//1
		int a = 100;
		int b = 25;
		double d = 3.14;
		double e = 1.41;
		//2
		char[] c = {'+','-','*','/','?'};
		//3
		Random rand = new Random();
		int r = rand.nextInt(5);
		char c1 = c[r];
		r = rand.nextInt(5);
		char c2 = c[r];
//		char c2 = '/';
		//4
		int ans1 = calc(a,c1,b);
		//5
		double ans2 = calc(d,c2,e);
		//6
		if (ans1 == -1)
			System.out.println("存在しない演算子です");
		else
			System.out.println("%d%s%d=%d".formatted(a,c1,b,ans1));
		//7
		if (ans2 == -1)
			System.out.println("存在しない演算子です");
		else
			System.out.println("%.2f%s%.2f=%f".formatted(d,c2,e,ans2));
		
	}
	
	public static int calc(int a , char b , int c) {
		double d = a;
		double e = c;
		double z = calc(d , b , e);
		return (int)z;
	}
	
	public static double calc(double a , char b , double c) {
		switch (b) {
		case '+' ->{
			return add(a,c);
		}
		case '-' ->{
			return sub(a,b);
		}
		case '*' ->{
			return mul(a,b);
		}
		case '/' ->{
			return div(a,b);
		}
		default ->{
			return -1;
		}
		}
	}
	
	public static double add(double x ,double y) {
		return x + y;
	}
	
	public static double sub(double x ,double y) {
		return x - y;
	}

	public static double mul(double x ,double y) {
		return x * y;
	}
	
	public static double div(double x ,double y) {
		return x / y;
	}

}
