package print7a_1.questions07;

public class Main {
	public static void main(String[] args) {
		String name = "のびた,どらえもん,すねお,じゃいあん,出木杉君,しずかちゃん";
		
		String[] names = name.split(",");
		
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("すねお"))
				System.out.println(i);
		}
		
	}

}
