package print2_2.questions03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("整数値を入力：");
		int x = sc.nextInt();
		System.out.print("整数値を入力：");
		int y = sc.nextInt();
		sc.close();

		if (x > y)
			System.out.printf("%1d は%1d より大きいです。\n",x,y);
		else if (x == y)
			System.out.printf("%1d と%1d の値は等しいです。\n",x,y);
		else
			System.out.printf("%1d は%1d より小さいです。",x,y);

	}

}
