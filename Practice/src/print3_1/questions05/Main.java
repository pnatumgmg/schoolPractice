package print3_1.questions05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ｎの値を入力：");
		int n = sc.nextInt();
		int ans = 0;
		sc.close();
		
		for (int i = 0; i < (n + 1); i += 2) {
			ans += i;
//			System.out.println(ans);
		}
		System.out.println(ans);
	}

}
