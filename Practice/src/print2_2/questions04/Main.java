package print2_2.questions04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("文字列A を入力：");
		String a = sc.nextLine();
		System.out.print("文字列B を入力：");
		String b = sc.nextLine();
		sc.close();
		
		if (a.equals(b))
			System.out.println("ふたつの文字は等しいです。");
		else
			System.out.println("ふたつの文字は等しくないです。");
	}

}
