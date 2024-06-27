package print5_1.questions12;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[][] MulTable = new int[9][9];
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				int x = (i + 1) * (j + 1);
				MulTable[i][j] = x;
			}
		}

		System.out.print("整数値を入力:");
		int need = sc.nextInt();
		String[] index = new String[81];
		

		for (int i = 0; i < 81; i++) 
			index[i] = "";

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9 ;j++) {
				if (MulTable[i][j] == need) {
					System.out.println((i + 1) + "×" + (j + 1));
					sum += 1;
				}
				int pro = 0;
				pro = (i + 1) * (j + 1) - 1;
				index[pro] += (i + 1) + "*" + (j + 1) + " ";
			}
		}
		
		if (sum == 0)	System.out.println("入力値が九九の表には存在しません");
		else			System.out.println(sum + "件見つかりました。");
		
		System.out.print("積を入力してください(1-81):");
		int product = sc.nextInt() - 1;
		sc.nextLine();
		System.out.println(index[product]);
		System.out.print("配列を見たいですよね？(はい or YES):");
		String a = sc.nextLine();
		
		if (!(a.isEmpty())) {
			for (int i = 0; i < 81 ;i++)
				System.out.println("[" + (i+1) + "]" + index[i]);
//				System.out.printf("[%2d]",(i+1));
		}else
			System.out.println("何か入力してください；；");

		sc.close();
	}
}