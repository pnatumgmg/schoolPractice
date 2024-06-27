package print0_1.questions01;

import java.util.Random;
import java.util.Scanner;

/*
 * パスワードを生成
 * [0-9,a-z,&#@._!+-]のみで構成されるパスワード
 * パスワードの桁数をコマンドラインより受け取る
 * 引数に"upper"がある場合は大文字が少なくとも一文字以上含まれるようにする
 * 
 */


public class Main {

	private static final String pswds = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz,&#@._!+-";//71文字//36-62

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pass = "";
		String number = "";
		if (args.length > 1) {
			number = args[0];
			pass = args[1];
		}
		int count = Integer.parseInt(number);
		if (pass.equals("upper"))
			pass = pasword_create("nekoooooooo", count);
		else 
			pass = pasword_create(count);
		
		/*
		boolean neko = true;
		System.out.print("文字数を指定！！！！！！:");
		int count = sc.nextInt();
		sc.nextLine();
		
		do {
			System.out.print("大文字を必須にしますか？？？？(y/n):");
			String upper = sc.nextLine();
			if (upper.equals("y")) {
				pass = pasword_create("nekoooooooo", count); 
				neko = false;
			}	
			else if (upper.equals("n")) {
				pass = pasword_create(count);
				neko = false;
			}
			else {
				System.out.println("yかnを入力してください");
			}
		}while(neko);
		*/
		
		sc.close();
		System.out.println(pass);
	}

	public static String pasword_create(int count) {
		String pasword = "";
		Random rand = new Random();

		for (int i = 0; i < count ; i++) {
			int r = rand.nextInt(70);
			pasword += pswds.charAt(r);
		}
		return pasword;
	}


	public static String pasword_create(String upper , int count) {
		boolean oomozi = true;
		String pasword = "";
		Random rand = new Random();
		do {pasword = "";
		for (int i = 0; i < count ; i++) {
			int r = rand.nextInt(70);
			pasword += pswds.charAt(r);
			if (r <= 25) {
				oomozi = false;
			}
		}
		}while(oomozi);
		return pasword;
	}

}
