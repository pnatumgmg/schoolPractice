package printG_1.questions02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> inputNum = new ArrayList<Integer>();
		System.out.print("入力回数を指定してください：");
		int count = sc.nextInt();
		
		
		for(int i = 0;i < count;i++) {
			System.out.print("入力：");
			inputNum.add(sc.nextInt());
		}
		
		sc.close();
		
		int min = Collections.min(inputNum);
		System.out.println("最小値：" + min);
	}
}
