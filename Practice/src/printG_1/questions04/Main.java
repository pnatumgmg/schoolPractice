package printG_1.questions04;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		TreeMap<String, String> weather = new TreeMap<String, String>();
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		System.out.println("データを5件入力してください。");
		for(int i = 0;i < 5;i++) {
			String input = sc.nextLine();
			String[] inputS = input.split(" ");
			weather.put(inputS[0], inputS[1]);
		}
		
		for(String a:weather.keySet()) {
			sb.append("," + a);
		}
		System.out.println(sb.toString().substring(1));
		
		System.out.println("表示したい年を入力してください");
		String year = sc.nextLine();
		
		if(weather.containsKey(year)) {
			System.out.println(weather.get(year));
		}else {
			System.out.println("データがありません");
		}
		
		sc.close();
	}
}