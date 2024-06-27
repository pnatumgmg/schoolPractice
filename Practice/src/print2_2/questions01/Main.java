package print2_2.questions01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("整数値を入力：");
		int x = sc.nextInt();
		sc.close();
		
		if (x > 5)
			System.out.println("5 より大きい値です。");
		
	}

}
