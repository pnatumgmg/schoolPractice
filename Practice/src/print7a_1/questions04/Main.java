package print7a_1.questions04;

public class Main {
	public static void main(String[] args) {
		String s = " Let it go. ";
		//1
		String s1 = s.trim();
		System.out.println(s1);
		//2
		int count = 0;
		if(s1.length() == 0)
			System.out.println("空白です");
		else
			for (int i = 0; i < s1.length(); i++)
				if (s1.charAt(i) == ' ')
					count += 1;
		System.out.println(count + 1);
		//3
		count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == 't')
				count += 1;
		}
		System.out.println(count);
		//4
		String[] spel = s1.split(" ");
		System.out.println(spel.length);
		//5
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < spel.length; i++) {
			sb.append(spel[i]);
		}
		String spell = sb.toString();
		System.out.println(spell);
		//6
//		for(int i = spell.length() - 1; i >= 0; i--) {
//			System.out.print(spell.charAt(i));
//		}
		
		sb.reverse();
		System.out.println(sb.toString());
		
		
		
		
		
			
	}

}
