package print3_1.questions11;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("mの値を入力:");
		int m = sc.nextInt();
		System.out.print("ｎの値を入力:");
		int n = sc.nextInt();
		sc.close();
		int ans = 0;
		
		while (n + 1 > m) {
//			System.out.println(ans);
			ans += m;
			m++;
		}
		System.out.println(ans);
	}

}
