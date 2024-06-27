package print1_1.questions14;

import java.util.Scanner;

public class Main {
	public static void main(String[] arge) {
		System.out.print("p の値を入力：");
		Scanner s = new Scanner(System.in);
//		double p = 3.14;
		double p = s.nextDouble();
		System.out.println("円周率は" + p + "です。");
//		int c = Integer.parseInt(p);
//		int a = p;
		System.out.println("円周率は" + (int)p + "です。");
//		System.out.println((int)p);
		double z = Math.PI;
		System.out.println("z の値は：" + z);
		
		s.close();
	}
}
