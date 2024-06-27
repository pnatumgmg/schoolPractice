package print5_2.questions07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = {"英語","国語","数学","社会","理科"};
		int[] b = new int[s.length];
		
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + ":");
			b[i] = sc.nextInt();
		}
		
		int count = 0;
		System.out.print("B君:");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
			System.out.print(" " + b[i] + "点");
			if (!(i == s.length - 1))
				System.out.print(",");
			if (b[i] <= 50)
				count++;
		}
		System.out.println();
		System.out.printf("B 君は%1d 科目追試が必要です。",count);
		sc.close();
	}

}
