package printG_1.questions06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> aList = new ArrayList<Integer>();
		
		System.out.print("乱数を作成する数を指定してください：");
		aList = getListData(sc.nextInt());
		sc.close();
		showListData(aList);
	}
	
	static ArrayList<Integer> getListData(int count){
		Random rand = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0;i < count;i++) {
			int r = rand.nextInt(100);
			list.add(r);
		}
		return list;
	}
	
	static void showListData(ArrayList<Integer> list) {
		for(int show:list) {
			System.out.println(show);
		}
	}
}
