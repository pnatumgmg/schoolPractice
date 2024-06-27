package print5_1.questions07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] s = {"英語","国語","数学","社会","理科"};
		int[] b = new int [5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] +":");
			b[i] = sc.nextInt();
		}
		System.out.print("B君:");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " " + b[i] + "点");
			if (i == s.length - 1) {
				break;
			}else
				System.out.print("、");
			if (b[i] <= 50) {
				sum += 1;
			}
		}
		System.out.println("");
		System.out.println("B 君は" + sum + " 科目追試が必要です。");
		
		sc.close();
	}

}
