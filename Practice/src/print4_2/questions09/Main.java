package print4_2.questions09;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("何回入力？:");
		int count= sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i < count; i++) {
			System.out.print("整数値:");
			int number = sc.nextInt();
			sum += number;
			if (sum > 1001) {
				sum -= number;
				System.out.println("合計が1000 超えました");
				System.out.println("最後の数値は無視します。");
				break;
			}
		}
		sc.close();
		System.out.printf("合計:%1d",sum);
	}

}
