package print2_1.questions04;

import java.util.Scanner;

public class Main {
	/*
	問4 
	if 文を使って以下のプログラムを作成しましょう。
	String 型変数strA とstrB に、キーボードから文字列を入力し、
	strA とstrB が等しいかどうかを判断する。
	等しい場合は「ふたつの文字は等しいです。」と表示する。
	等しくない場合は「ふたつの文字は等しくないです」と表示する。
	実行結果例 (等しい時) 実行結果例 (等しくないとき)
	文字列A を入力：あいうえお (キーボード入力)
	文字列B を入力：あいうえお(キーボード入力)
	ふたつの文字は等しいです。（表示）
	文字列A を入力：あいうえお (キーボード入力)
	文字列B を入力：かきくけこ (キーボード入力)
	ふたつの文字は等しくないです。（表示）
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("文字列A を入力：");
		String a = sc.nextLine();
		System.out.print("文字列B を入力：");
		String b = sc.nextLine();
		sc.close();
		
		if (a.equals(b)) {
			System.out.println("ふたつの文字は等しいです。");
		} else {
			System.out.println("ふたつの文字は等しくないです。");
		}
		
		
	}

}
