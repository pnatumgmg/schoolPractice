package printJ_FileReader.questions02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//1
		ArrayList<TempData> at = new ArrayList<TempData>();

		//2
		Scanner sc = new Scanner(System.in);


		//3
		CsvReader cs = new CsvReader();

		//4
		cs.CsvFileReader(at);

		//5
		int select;
		while(true) {
			System.out.println("昇順ソートして表示します。");
			System.out.println("0:日付 1:平均気温 2:最高気温 3:最低気温");
			select = sc.nextInt();
			if(select == 0 || select == 1 || select == 2 || select == 3) {
				break;
			}
		}
		
		sc.close();
		
		//6
		Collections.sort(at,new TempComparator(select));
		
		//7
		show(at);
		
	}
	
	public static void show(ArrayList<TempData> at) {
		for(TempData t:at) {
			System.out.println("%s 平均気温：%2.1f 最高気温：%2.1f 最低気温：%2.1f"
					.formatted(t.strDate(),t.getAveTemp(),t.getMaxTemp(),t.getMinTemp()));
		}
	}

}
