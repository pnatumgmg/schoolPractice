package print7a_1.questions05;

public class Main {
	public static void main(String[] args) {
		String[] s = {"英語","国語","数学","社会","理科"};
		int[] a = {75,80,60,90,55};
		
		StringBuilder sb = new StringBuilder();
		sb.append("A君：");
		
		for (int i = 0; i < s.length; i++) {
			sb.append(s[i]).append(a[i]);
			if (i < s.length - 1)
				sb.append(",");
		}
		
		String f = sb.toString();
		System.out.println(f);
	}

}
