package print3_1.questions08;

public class Main {
	public static void main(String[] args) {
		int i = 5;
		boolean re_start = true;
		while (re_start) {
			System.out.println(i);
			i --;
			if (i < 1) {
				re_start = false;
			}
		}
	}

}
