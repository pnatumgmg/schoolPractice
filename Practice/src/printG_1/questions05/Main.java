package printG_1.questions05;

import java.util.HashSet;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		HashSet<Integer> bingo = new HashSet<Integer>();
		Random rand = new Random();
		
		while(true) {
			int r = rand.nextInt(100);
			bingo.add(r);
			if (bingo.size() == 24) {
				break;
			}
		}
		
		int count = 0;
		
		for(int view:bingo) {
			count++;
			System.out.printf("%3d",view);
			if (count % 5 == 0) {
				System.out.println();
			}
			if (count == 12) {
				System.out.printf("%2s","☆");
				count++;
			}
		}
	}
}