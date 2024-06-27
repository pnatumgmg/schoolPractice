package print5_1.questions12_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = 9;
		int y = 9;
		int[][] MulTable = new int[t][y];
		int sum = 0;
//		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < y; j++) {
				int x = (i + 1) * (j + 1);
				MulTable[i][j] = x;
			}
		}
		
		System.out.print("整数値を入力:");
		int need = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < y ;j++) {
				if (MulTable[i][j] == need) {
					System.out.println((i + 1) + "×" + (j + 1));
					sum += 1;
				}
			}
		}
		System.out.println(sum + "件見つかりました。");
	}

}
