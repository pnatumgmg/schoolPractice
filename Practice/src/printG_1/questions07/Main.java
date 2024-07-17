package printG_1.questions07;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		//(1)
		System.out.print("乱数を発生させる数を指定してください：");
		//(2)
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//(3)
		System.out.print("探したい数字を指定してください：");
		//(4)
		int key = sc.nextInt();
		sc.close();
		//(5)
		Set<Integer> set = new LinkedHashSet<>();
		set = getSet(n);
		//(6)
		int index = getNum(set,key);
		//(7)
		printIndex(index);
		//(8)
		showSet(set);
	}
	
	static Set<Integer> getSet(int count){
		LinkedHashSet<Integer> lSet = new LinkedHashSet<Integer>();
		Random rand = new Random();
		int c = 0;
		while(true) {
			int r = rand.nextInt(count * 2);
			lSet.add(r);
			c++;
			if (c == count) {
				break;
			}
		}
		return lSet;
	}
	
	static int getNum(Set<Integer> lSet,int key) {
		int count = 0;
		for (int now:lSet) {
			if (now == key) {
				return count;
			}
			count++;
		}
		return -1;
	}
	
	static void printIndex(int index) {
		if (index < 0) {
			System.out.println("その値は要素に存在しません");
		}else {
			System.out.println("その値は%d番目にあります"
					.formatted(index));
		}
	}
	
	static void showSet(Set<Integer> lSet) {
		for(int show:lSet) {
			System.out.println(show);
		}
	}
}
