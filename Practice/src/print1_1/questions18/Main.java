package print1_1.questions18;

public class Main {
	public static void main(String[] args) {
		System.out.print("整数n：");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int n = scanner.nextInt();
		int r = new java.util.Random().nextInt(n + 1);
		System.out.println("乱数値：" + r);//値は０～n のいずれか1	
		scanner.close();
	}
}