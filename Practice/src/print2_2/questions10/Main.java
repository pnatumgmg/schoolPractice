package print2_2.questions10;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("グー：０、チョキ：１、パー：２:");
		int hand = sc.nextInt();
		sc.close();
		String your_hand = "あなたの手は%1sです";
		String npc_hand = "NPC の手は%1sです";
		
		if (!(hand == 0 || hand == 1 || hand == 2))
			System.out.println("入力が不正です");
		else {
			int npc = rand.nextInt(3);
			switch (hand) {
			case 0 -> System.out.printf(your_hand,"グー");
			case 1 -> System.out.printf(your_hand,"チョキ");
			case 2 -> System.out.printf(your_hand,"パー");
			}
			System.out.println();
			switch (npc) {
			case 0 -> System.out.printf(npc_hand,"グー");
			case 1 -> System.out.printf(npc_hand,"チョキ");
			case 2 -> System.out.printf(npc_hand,"パー");
			}
			System.out.println();
			int result = (hand - npc) + 3 % 3;
			if (result == 2)
				System.out.println("あなたの勝ちです。");
			else if (result == 1)
				System.out.println("あなたの負けです。");
			else
				System.out.println("drow");
		}
	}

}
