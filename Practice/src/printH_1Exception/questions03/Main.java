package printH_1Exception.questions03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("整数を入力してください。");
		String str = sc.nextLine();
		try {
			int num = Integer.parseInt(str);
			System.out.println("入力された整数は" + num + "です。");
			
		}catch(NumberFormatException e){
			System.out.println("整数値ではありません");
		}
		
	}
	
	
	

}
