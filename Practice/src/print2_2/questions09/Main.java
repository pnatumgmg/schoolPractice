package print2_2.questions09;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("plase your score:");
		int score = sc.nextInt();
		sc.close();
		
		if (score > 89)
			System.out.println("優秀");
		else if (score > 79)
			System.out.println("良好");
		else if (score > 69)
			System.out.println("普通");
		else if (score > 59)
			System.out.println("可");
		else
			System.out.println("不可");
	}

}
