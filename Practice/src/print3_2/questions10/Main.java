package print3_2.questions10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ｎの値を入力：");
		int x = sc.nextInt();
		int i = 0;
		int ans = 0;
		sc.close();
		
		while (i < x + 1) {
			ans += i;
			i += 2;
		}
		
		System.out.println(ans);
	}

}
