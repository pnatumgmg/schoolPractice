package printH_1Exception.questions01;

public class Main {
	public static void main(String[] args) {
		int x = 5;
		int y = 0;
		try{
			int result = x / y;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("0で割ることはできません");
		}

	}

}
