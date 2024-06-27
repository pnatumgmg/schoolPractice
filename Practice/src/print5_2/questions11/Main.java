package print5_2.questions11;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		//1
		int[][] a = new int[5][5];
		//2
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(50) + 1;
				if (i == 2 && j == 2)
					a[i][j] = 0;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == 2 && j == 2)
					System.out.printf("%2s","☆");
				else
					System.out.printf("%3d",a[i][j]);
				
			}
			System.out.println();
		}
		
	}

}
