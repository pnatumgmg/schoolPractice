package printG_1.questions03;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashMap<String, Integer> fruits = new HashMap<String, Integer>();
		
		if(fruits.isEmpty()) {
			System.out.println("fruits の中身は空です");
		}else {
			System.out.println("fruitsの中身はあります");
		}
		//(4)
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i < 3;i++) {
			System.out.print("入力：");
			String input = sc.nextLine();
			String[] inputS = input.split(" ");
			String kazu = inputS[1].replace("個", "");
			int num = Integer.parseInt(kazu);
			fruits.put(inputS[0], num);
		}
		sc.close();
		//(5)
		for (String key: fruits.keySet()) {
			int value = fruits.get(key);
			System.out.println("果物名：" + key + " 個数：" + value);
		}
		//(6)
		System.out.println("fruitsの要素数：" + fruits.size());
		//(7)
		fruits.remove("みかん");
		//(8)
		for (String key: fruits.keySet()) {
			int value = fruits.get(key);
			System.out.println("果物名：" + key + " 個数：" + value);
		}
		
	}

}
