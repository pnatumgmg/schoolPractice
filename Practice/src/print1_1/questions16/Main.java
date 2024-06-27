package print1_1.questions16;

public class Main {
	public static void main(String[] args) {
		System.out.print("名前を入力：");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		String name = scanner.nextLine();
		System.out.print("年齢を入力：");
		String age = scanner.nextLine();
		System.out.println(name + "さんの年齢は"+ age + " 歳です。");
		
		scanner.close();
	}

}