package print4_1.plus_alpha;

import java.util.Random;
import java.util.Scanner;

/*
 *  * 10桁のパスワードを生成する。
 * 乱数で0x21(33)~0x7E(126)を生成
 * intをcharに変換
 * 10文字生成し、10文字を一度のprintln()で表示。
 * パスワードに次の文字は含めてはいけない。*42^94 \92 ' 39
 * 　結果として出力が10文字未満になってもよい。
 * キーボード指定の桁数パスワードを生成する。(10桁とは限らない)
 */
public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		String ans = "";
		System.out.print("文字数を指定してください:");
		int sum = sc.nextInt();
		sc.close();
		
		
		for (; ans.length() < sum;){
			int num = rand.nextInt(93)+33;
			
			if (num == 42) {
			}else if (num == 94) {
			}else if (num == 92) {
			}else if (num == 39) {
			}else {
				ans += (char)num;
			}
		}
		System.out.println(ans);
//		System.out.println(ans.length());
	}

}