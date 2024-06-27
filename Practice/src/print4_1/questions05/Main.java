package print4_1.questions05;

public class Main {
	public static void main(String[] args) {
		int ans = 1;
		while (ans < 101) {
			if (ans % 3 == 0) {
				System.out.println(ans);
			}
			ans++;
		}
	}

}
