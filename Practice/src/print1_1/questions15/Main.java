package print1_1.questions15;

public class Main {
	public static void main(String[] args) {
		System.out.print("名前を入力：");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("猫の名前は" + name + "です。");
		scanner.close();
		
		
	}

}