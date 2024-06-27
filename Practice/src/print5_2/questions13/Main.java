package print5_2.questions13;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		//1
		int[] ary = new int[20];
		//2
		Random rand = new Random();
		for (int i = 0; i < ary.length; i++) {
			int r = rand.nextInt(100);
			ary[i] = r;
		}
		//3
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]);
			if (!(i == ary.length))
				System.out.print(" ");
		}
		System.out.println();
		//4
		for (int i = 0; i < ary.length; i++) {
			for (int j = i + 1; j < ary.length; j++) {
				if (ary[i] > ary[j]) {
					int x = ary[i];
					ary[i] = ary[j];
					ary[j] = x;
				}
			}	
		}	
		//5
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]);
			if (!(i == ary.length))
				System.out.print(" ");
		}
		System.out.println();
	}

}
