package print5_1.questions10;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		String[] omikuzi = {"凶","吉","中吉","大吉"};
		
		Random rand = new Random();
		int result = rand.nextInt(4);
		
		System.out.println(omikuzi[result]);
		
	}

}
