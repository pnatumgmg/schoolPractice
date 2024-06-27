package print3_1.questions09;

public class Main {
	public static void main(String[] args) {
		int i = 1;
		boolean re_start = true;
		int ans = 0;
		
		while (re_start) {
			ans += i;
			i ++;
			if (i > 10) {
				re_start = false;
			}
		}
		System.out.println(ans);
	}

}
