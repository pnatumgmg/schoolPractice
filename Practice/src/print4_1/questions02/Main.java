package print4_1.questions02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int ans = 0;
		
		while (true) {
			System.out.print("入力:");
			x = sc.nextInt();
			if (x > 0) {
				ans += x;
			}else if (x == 0) {
				break;
			}else {
				continue;
			}
		}
		System.out.println("合計は" + ans + "です。");
		sc.close();
	}

}
