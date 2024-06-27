package print2_1.questions06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("整数値a を入力：");
		int a = sc.nextInt();
		System.out.print("整数値b を入力：");
		int b = sc.nextInt();
		System.out.print("整数値c を入力：");
		int c = sc.nextInt();
		sc.close();
		int ma;
		int mi;
		
		if (a >= b) {
			ma = a;
			mi = b;
			if (a >= c) {
				ma = a;
				if (b >= c) {
					mi = c;
				}
			}
		}else if (b > c) {
			ma = b;
			mi = c;
			if (a < c) {
				mi = a;
			}
		}else {
			ma = c;
			mi = a;
		}
		System.out.println("最大値：" + ma);
		System.out.println("最小値：" + mi);
	}

}
