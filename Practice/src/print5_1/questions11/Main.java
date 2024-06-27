package print5_1.questions11;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int[][] a = new int [5][5];
		Random rand = new Random();
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int x = rand.nextInt(50) + 1;
				if (i == 2 && j == 2) {
					a[i][j] = 0;
				}else {
					a[i][j] = x;
				}
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (a[i][j] == 0) {
					System.out.printf("%2s","☆");
				}else {
					System.out.printf("%3d",a[i][j]);
				}
			}
			System.out.println("");
		}
	}

}
