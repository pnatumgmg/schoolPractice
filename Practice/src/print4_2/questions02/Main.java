package print4_2.questions02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		
		while (true) {
			System.out.print("入力:");
			int input = sc.nextInt();
			if (input == 0)			break;
			else if (input < 0)		continue;
			else 					ans += input;
				
		}
		
		sc.close();
		System.out.println(ans);
	}

}
