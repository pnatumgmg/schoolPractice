package print1_2.questions19;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int r = rand.nextInt(11)-5;
		
		System.out.printf("乱数値：%1d",r);
		
	}

}
