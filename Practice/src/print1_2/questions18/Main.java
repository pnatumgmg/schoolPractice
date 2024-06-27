package print1_2.questions18;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("整数n：");
		int n = sc.nextInt();
		int r = rand.nextInt(n);
		
		System.out.printf("乱数値：%1d",r);
		sc.close();
	}

}
