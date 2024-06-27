package print2_1.questions09;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		sc.close();
		
		if (score >= 90) {
			System.out.println("優秀");
		}else if (score >= 80){
			System.out.println("良好");
		}else if (score >= 70) {
			System.out.println("普通");
		}else if (score >= 60) {
			System.out.println("可");
		}else {
			System.out.println("不可");
		}
		
	}

}
