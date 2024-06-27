package print2_1.questions10;
//		(((x - y) + 3) % 3) 0=あいこ　1=負け　2=勝ち

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean end = true;
		Scanner sc = new Scanner(System.in);
		
		while (end) {
			System.out.println("自分の手に対応する数字を入力（グー：０、チョキ：１、パー：２）");
			int x = sc.nextInt();
			int hand = start(x);
			if (hand == 4) {
				break;
			}
			int enemy = enemy();
			int result = result(hand,enemy);
		
			if (result == 0) {
				System.out.println("引き分けですもう一度");
			}else if (result == 1) {
				System.out.println("あなたの勝ちです。");
				end = false;
			}else {
				System.out.println("あなたの負けです。");
				end = false;
			}
		}
		sc.close();
	}
	
	public static int start(int x) {
		int hand = x;
		int number = 3;
		
		if (hand == 0) {
			System.out.println("あなたの手はグーです");
			number = 0;
		}else if (hand == 1) {
			System.out.println("あなたの手はチョキです");
			number = 1;
		}else if (hand == 2) {
			System.out.println("あなたの手はパーです");
			number = 2;
		}else {
			System.out.println("入力が不正です");
			number = 4;
		}
		return number;

	}
	
	public static int enemy() {
		Random rand = new Random();
		int hand = rand.nextInt(3);
		if (hand == 0) {
			System.out.println("NPC の手はグーです");
		}else if (hand == 1) {
			System.out.println("NPC の手はチョキです");
		}else if (hand == 2) {
			System.out.println("NPCの手はパーです");
		}
		return hand;

	}
	
	public static int result(int me,int enemy) {
		int kekka = 0;
		if (me == 0) {
			if (enemy == 0) {
				kekka = 0;
			}else if (enemy == 1) {
				kekka = 1;
			}else {
				kekka = 2;
			}
		}else if (me == 1) {
			if (enemy == 0) {
				kekka = 2;
			}else if (enemy == 1) {
				kekka = 0;
			}else {
				kekka = 1;
			}
		}else {
			if (enemy == 0) {
				kekka = 1;
			}else if (enemy == 1) {
				kekka = 2;
			}else {
				kekka = 0;
			}
		}
		return kekka;
	}

}