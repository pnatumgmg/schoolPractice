package print1_1.questions13;

public class Main {
	public static void main(String[] arge) {
		System.out.print("x の値を入力：");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		String x = scanner.nextLine();
//		System.out.println(x);
		System.out.print("y の値を入力：");
		int y = scanner.nextInt();
		int z = Integer.parseInt(x) + y;
//		int z = (int)x + y;
		
		System.out.println("ｚ= " + z);
		
		scanner.close();
	}

}
