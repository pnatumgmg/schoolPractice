package print5_2.questions04;

public class Main {
	public static void main(String[] args) {
		double sum = 0;
		
		double[] temp = {33.2,33.6,34.9,38.4,34,30.7,27.5};
		for (int i = 0; i < temp.length; i++)
			sum += temp[i];
		
		double ave = sum / temp.length;
		System.out.printf("平均気温は%1.2f 度です。",ave);
	}

}
