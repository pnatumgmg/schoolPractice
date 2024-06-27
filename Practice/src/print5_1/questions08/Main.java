package print5_1.questions08;

public class Main {
	public static void main(String[] args) {
		int[] c = {25,94,89,10,3,14,11,67};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < c.length; i++) {
			if (min > c[i]) {
				min = c[i];
			}
			if (max < c[i]) {
				max = c[i];
			}
		}
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
	}

}
