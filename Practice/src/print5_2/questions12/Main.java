package print5_2.questions12;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//1
		int[][] MulTable = new int[9][9];
		//2
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				MulTable[i][j] = (i + 1) * (j + 1);
			}
		}
		//3
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("整数値を入力:");
		int x = sc.nextInt();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (MulTable[i][j] == x) {
					System.out.println((i+1) + "×" + (j+1));
					count += 1;
				}
			}
		}
		if (count == 0)
			System.out.println("入力値が九九の表には存在しません");
		else
			System.out.println(count + "件見つかりました。");
		sc.close();
	}

}
