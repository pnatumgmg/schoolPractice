package print6_1.questions13;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int x = inputNumber();
		String msg = numberToMessage(x);
		showMessage(msg);
		
	}

	/**
	 * 
	 * @return
	 */
	public static int inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input no.:");
//		return sc.nextInt();
		
		int x = sc.nextInt();
		sc.close();
		return x;
	}
	/**
	 * 
	 * @param x
	 * @return
	 */
	public static String numberToMessage(int x) {
		switch(x) {
		case 1 ->{
			return "Good Morning";
		}
		case 2 ->{
			return "Good Afternoon";
		}
		case 3 ->{
			return "Good Evening";
		}
		default ->{
			return "入力内容に間違いがあります";
		}
		}
	}
	/**
	 * 
	 * @param msg
	 */
	public static void showMessage(String msg) {
		System.out.println(msg);
	}
}