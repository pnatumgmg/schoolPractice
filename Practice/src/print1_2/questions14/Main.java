package print1_2.questions14;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("p の値を入力：");
		double p = sc.nextDouble();
		System.out.printf("円周率は%3.2f です。\n",p);
		int pp = (int)p;
		System.out.printf("円周率は%1d です。\n", pp);
		System.out.println("z の値は：" + Math.PI);
		
		sc.close();
		
	}

}
