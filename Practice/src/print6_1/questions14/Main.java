package print6_1.questions14;

//55

public class Main {
	public static void main(String[] aegs) {
		int z = function(10);
		System.out.println(z);
	}
/**
 * 
 * @param n
 * @return
 */
	public static int function(int n) {
		if(n==1) {
			return 1;
		} else {
			return n+function(n-1);
		}
	}
}