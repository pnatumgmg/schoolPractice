package print6_1.questions04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double takasa = sc.nextDouble();
		double yoko = sc.nextDouble();
		printRA(takasa, yoko);
		sc.close();
	}
	
	public static void printRA(double height,double width) {
		System.out.println(height * width);
	}

}
