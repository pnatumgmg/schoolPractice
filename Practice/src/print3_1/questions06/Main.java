package print3_1.questions06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("ｍの値を入力：");
		int m = sc.nextInt();
		System.out.print("nの値を入力：");
		int n = sc.nextInt();
		sc.close();
		
		for (int i = m; i < (n + 1); i++) {
			ans += i;
		}
		System.out.println(ans);
		
	}

}
