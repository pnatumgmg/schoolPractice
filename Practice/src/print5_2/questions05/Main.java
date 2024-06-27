package print5_2.questions05;

public class Main {
	public static void main(String[] args) {
		String[] s = {"英語","国語","数学","社会","理科"};
		int [] a = {75,80,60,90,55};
		System.out.print("A君:");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
			System.out.print(a[i] + "点");
			if (!(i == s.length - 1))
				System.out.print(",");
				
		}
	}

}
