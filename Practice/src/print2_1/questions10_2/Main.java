package print2_1.questions10_2;

import java.util.Random;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		System.out.println("自分の手に対応する数字を入力（グー：０、チョキ：１、パー：２）");
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int hand = sc.nextInt();
		int enemy = rand.nextInt(3);
		
		if (hand == 0) {
			System.out.println("あなたの手はグーです");
			if (enemy == 0) {
				System.out.println("NPC の手はグーです");
			}else if (enemy == 1) {
				System.out.println("NPC の手はチョキです");
				System.out.println("あなたの勝ちです");
			}else {
				System.out.println("NPCの手はパーです");
				System.out.println("あなたの負けです。");
			}
		}else if (hand == 1) {
			System.out.println("あなたの手はチョキです");
			if (enemy == 0) {
				System.out.println("NPC の手はグーです");
				System.out.println("あなたの負けです。");
			}else if (enemy == 1) {
				System.out.println("NPC の手はチョキです");
			}else {
				System.out.println("NPCの手はパーです");
				System.out.println("あなたの勝ちです");
			}
		}else if (hand == 2) {
			System.out.println("あなたの手はパーです");
			if (enemy == 0) {
				System.out.println("NPC の手はグーです");
				System.out.println("あなたの勝ちです");
			}else if (enemy == 1) {
				System.out.println("NPC の手はチョキです");
				System.out.println("あなたの負けです。");
			}else {
				System.out.println("NPCの手はパーです");
			}
		}else {
			System.out.println("入力が不正です");
		}
		sc.close();
		
		
	}

}
