package print5_1.questions04;

public class Main {
	public static void main(String[] args) {
		double[] temp = {33.2,33.6,34.9,38.4,34,30.7,27.5};
		double sum = 0;
		
		for (int i = 0; i < temp.length; i++) {
			sum += temp[i];
		}
		double ave = sum / temp.length;
		System.out.println("平均気温は" + ave + "度です。");
//		System.out.printf("平均気温は%.2f度です。",ave);
	}

}
