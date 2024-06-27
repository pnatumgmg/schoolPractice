package print6_1.questions08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("整数を入力してください！！！");
		int a = sc.nextInt();
		System.out.print("整数を入力してください！！！");
		int b = sc.nextInt();
		sc.close();
		
		System.out.println("a+b=%d".formatted(add(a,b)));
		System.out.println("a-b=%d".formatted(sub(a,b)));
		System.out.println("a*b=%d".formatted(mul(a,b)));
		System.out.println("a/b=%d".formatted(div(a,b)));
		System.out.println("(a+b)*(a-b)=%d".formatted(mul(add(a,b),sub(a,b))));
		
	}
	
	public static int add(int a , int b) {
		return a + b;
	}
	
	public static int sub(int a , int b) {
		return a - b;
	}
	
	public static int mul(int a , int b) {
		return a * b;
	}
	
	public static int div(int a , int b) {
		return a / b;
	}

}
