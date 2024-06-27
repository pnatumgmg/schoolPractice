package print7a_1.questions08;

public class Main {
	public static void main(String[] args) {
		String a = "abc123def456";
		
		String new_a = a.replaceAll("[a-z]", "0");
//		String new_a = a.replaceAll("a", "0");
		
		
		System.out.println(new_a);
		

	//replace ALLとreplaceの使い分け
//		String b = "[a-z]を表示します(yes:no)";
//		System.out.println(b);

//		String new_b = b.replace("[a-z]", "[A-Z]");
//		System.out.println(new_b);
		
		
	}

}
