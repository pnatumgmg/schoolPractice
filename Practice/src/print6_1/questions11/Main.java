package print6_1.questions11;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("面積を求めます");
		System.out.print("縦の長さ：");
		double tate = sc.nextDouble();
		System.out.print("横の長さ：");
		double yoko = sc.nextDouble();
		double arey;
		sc.close();
		
		if (tate == yoko)
			arey = getArea(tate);
		else
			arey = getArea(tate,yoko);
		
		System.out.println("面積=%f".formatted(arey));
			
	}
	
	public static double getArea(double tate, double yoko) {
		return tate * yoko;
	}
	
	public static double getArea(double ippen) {
		return ippen * ippen;
	}

}
