package print3_1.questions10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ｎの値を入力:");
		int n = sc.nextInt();
		int ans = 0;
		int j = 0;
		sc.close();
	
		while (j < n / 2 + 1) {
			ans += j * 2;
			j++;
		}
		System.out.println(ans);
	}

}
