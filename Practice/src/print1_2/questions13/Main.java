package print1_2.questions13;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x の値を入力：");
		String x = sc.nextLine();
		System.out.print("y の値を入力：");
		int y = sc.nextInt();
		sc.close();
		
		System.out.printf("ｚ= %2d",Integer.parseInt(x) + y);
	}

}
