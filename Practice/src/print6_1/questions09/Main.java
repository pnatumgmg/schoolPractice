package print6_1.questions09;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int [] nyaa = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("整数を入力してください！！！:");
			nyaa[i] = sc.nextInt();
		}
		sc.close();
		
		int min = getMinValue(nyaa);
		System.out.println("最小値は%dです".formatted(min));
		
	}
	
	public static int getMinValue(int[] array) {
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			if (min > array[i])
				min = array[i];
		}
		return min;
	}

}
