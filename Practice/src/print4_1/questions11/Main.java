package print4_1.questions11;
//(((x - y) + 3) % 3) 0=あいこ 1=負け 2=勝ち

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		boolean bool = true;
		String next;
		int hand;
		String you = "あなたの手は";
		String me = "NPCの手は";

		do {
			do {
				System.out.print("あなたの手を入力してください（グー：０，チョキ：１，パー：２）:");
				hand = sc.nextInt();
				sc.nextLine();
			}while(!(hand == 0 || hand == 1 || hand == 2));

			int npc = rand.nextInt(3);

			switch (hand){
			case 0 ->
			System.out.println(you + "グーです");
			case 1 ->
			System.out.println(you + "チョキです");
			case 2 ->
			System.out.println(you + "パーです");
			}

			switch (npc){
			case 0 ->
			System.out.println(me + "グーです");
			case 1 ->
			System.out.println(me + "チョキです");
			case 2 ->
			System.out.println(me + "パーです");
			}

			int rusult = ((hand - npc) + 3) % 3;
			if (rusult == 0) 
				System.out.println("あいこ");
			else if (rusult == 1)
				System.out.println("あなたの負け");
			else 
				System.out.println("あなたの勝ち");
			
			do {
				System.out.print("再度対戦しますか？(y/n):");
				next = sc.nextLine();
			}while(!(next.equals("y") || next.equals("n")));
			
			if (next.equals("n"))
				bool = false;
		}while(bool);

		System.out.println("プログラムを終了します");
		sc.close();
	}

}
