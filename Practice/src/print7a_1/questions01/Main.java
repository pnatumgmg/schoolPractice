package print7a_1.questions01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("strA:");
		String a = sc.nextLine();
		System.out.print("strB:");
		String b = sc.nextLine();
		sc.close();
		
		if (a.equals(b))
			System.out.println("strA とstrB は等しいです。");
		else
			System.out.println("strA とstrB は等しくないです。");
	}

}
