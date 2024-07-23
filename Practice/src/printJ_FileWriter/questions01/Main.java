package printJ_FileWriter.questions01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//1
		Scanner sc = new Scanner(System.in);
		//2
		ArrayList<Person> ap = new ArrayList<>();
		//3
		CsvFileWriter cfw = new CsvFileWriter();
		//4
		System.out.println("何件登録しますか？");
		int count = sc.nextInt();
		sc.nextLine();
		for(int i = 0;i < count;i++) {
			System.out.println("フルネームを入力してください。名字と名前の間に全角スペースを入れてください。");
			String nameSet = sc.nextLine();
			String[] names = nameSet.split(" ");
 			System.out.println("年齢を入力してください");
			String strAge = sc.nextLine();
			int age = Integer.parseInt(strAge);
			System.out.println("職業を入力してください");
			String job = sc.nextLine();
			ap.add(new Person(names[0],names[1],age,job));
		}
		sc.close();
		
		System.out.println(cfw.CsvWriter(ap));
		
	}

}
