package print4_1.questions09;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
//		int tentative = 0;
		System.out.print("何回入力?:");
		int count = sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			System.out.print("整数値:");
			int tentative = sc.nextInt();
			ans += tentative;
			if (ans >= 1000) {
				System.out.println("合計が1000を超えました");
				System.out.println("最後の入力を無視します");
				ans -= tentative;
				break;
			}
		}
		System.out.println("合計:" + ans);
		sc.close();
	}

}
