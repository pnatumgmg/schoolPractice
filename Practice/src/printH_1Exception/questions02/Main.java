package printH_1Exception.questions02;

public class Main {
	public static void main(String[] args) {
		String str = null;
		try {
			int length = str.length();
			System.out.println(length);
		}catch(NullPointerException e){
			System.out.println("null参照があります");
		}
		
	}

}
