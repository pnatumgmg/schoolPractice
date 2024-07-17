package printG_1.questions01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<String>  b = new ArrayList<String>();
		
		a.add(1); a.add(10); a.add(100);
		a.add(5); a.add(50); a.add(500);
		
		b.add("のび太"); 
		b.add("すねお");
		b.add("ジャイアン");
		b.add("しずかちゃん");
		b.add("出木杉君");
		//(5)
		for (int i = 0;i < a.size();i++) {
			System.out.println(a.get(i));
		}
		//(6)
		Iterator<String> it = b.iterator();
		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
		//(7)
		for (int i = 0;i < a.size();i++) {
			if(a.get(i) >= 100) {
				a.remove(i);
				i--;
			}
		}
		//(8)
		for(int i:a) {
			System.out.println(i);
		}
		//(9)
//		a.sort(null);
		Collections.sort(a);
		for(int i:a) {
			System.out.println(i);
		}
		//(10)
		a.clear();
		//(11)
		if(a.isEmpty()) {
			System.out.println("変数a の中身は空です");
		}else {
			System.out.println("変数a の中身は空ではありません");
		}
	}
}
