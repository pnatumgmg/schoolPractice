package print3_2.questions14;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int x = 0;
		System.out.print("入力値：");
		String input = sc.nextLine();
		sc.close();
		
		if ("upcount".equals(input)) {
			i = 1;
			x = 11;
			for (;i < x; i++)
				System.out.println(i);
			
		}else if ("downcount".equals(input)) {
			i = 10;
			x = 0;
			for (;i > x; i--)
				System.out.println(i);
			
		}else 
			System.out.println("入力値が不正です。");
		
	}

}
