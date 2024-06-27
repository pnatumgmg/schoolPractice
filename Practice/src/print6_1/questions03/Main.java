package print6_1.questions03;

public class Main {
	public static void main(String[] args) {
		String neko = "ねこ！！！！";
		int count = 5;
		printMsg2(neko,count);
		
	}
	
	public static void printMsg2(String hello,int count) {
		for (int i = 0; i < count ; i++) {
			System.out.println(hello);
		}
	}

}
