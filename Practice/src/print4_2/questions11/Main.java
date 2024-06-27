package print4_2.questions11;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int hand;
		String next;
		//1
		boolean bool = true;
		//2
		while(bool) {
			//3
			do {
				System.out.print("あなたの手を入力してください（グー：０，チョキ：１，パー：２）:");
				hand = sc.nextInt();
				sc.nextLine();
			}while(!(hand == 0 || hand == 1 || hand == 2));
			//4
			int npc_hand = rand.nextInt(3);
			//5
			String player_coment = "あなたの手は%1sです";
			String npc_coment = "NPCの手は%1sです";
			switch (hand) {
			case 0 -> System.out.printf(player_coment,"グー");
			case 1 -> System.out.printf(player_coment,"チョキ");
			case 2 -> System.out.printf(player_coment,"パー");
			}
			System.out.println();
			switch (npc_hand) {
			case 0 -> System.out.printf(npc_coment,"グー");
			case 1 -> System.out.printf(npc_coment,"チョキ");
			case 2 -> System.out.printf(npc_coment,"パー");
			}
			System.out.println();
			//6
			int result = ((hand - npc_hand) + 3) % 3;
			if (result == 1)		System.out.println("あなたの負け");
			else if (result == 2)	System.out.println("あなたの勝ち");
			else 					System.out.println("あいこ");
			//7
			do {
				System.out.print("再度対戦しますか？(y/n) :");
				next = sc.nextLine();
			}while(!(next.equals("y") || next.equals("n")));
			if (next.equals("n"))		bool = false;
		}
		System.out.println("プログラムを終了します");
		sc.close();
	}
}