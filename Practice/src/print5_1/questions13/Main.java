package print5_1.questions13;

import java.util.Random;

/*
 * バブルソート、選択ソート、挿入ソート
 */

public class Main {
	public static void main(String[] args) {
		//1
		int[] ary = new int[20];
		//2
		Random rand = new Random();
		for (int i = 0; i < ary.length; i++) {
			int x = rand.nextInt(100);
			ary[i] = x;
		}
		//3
		
//		System.out.print("最初");
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i] + " ");
		}
		
		
		//4
		//バブルソート (選択ソート？）
		/*
		int x = 0;
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary.length; j++) {
				if (ary[i] < ary[j]) {
					x = ary[i];
					ary[i] = ary[j];
					ary[j] = x;
				}
			}
		}
		*/
		
		//選択ソート (選択ソート？）
		/*
		int x = 0;
		for (int i = 0; i < ary.length; i++) {
			int mini = i;
			for (int j = i + 1; j < ary.length; j++) {
				if (ary[mini] > ary[j]) {
					mini = j;
				}
			}
			
			x = ary[i];
			ary[i] = ary[mini];
			ary[mini] = x;
			
		}
		*/
		
		//挿入ソート(じゃなさそう）
//		挿入ソートfor ver
		
		
		for (int i = 1; i < ary.length; i++) {
		/*動作確認用
			System.out.println("");
			for (int k = 0; k < ary.length; k++) {
				System.out.print(ary[k] + " ");
			}	
		*/
			for (int j = i; j >= 1 && ary[j] < ary [j-1]; j--) {
				int x = ary[j];
				ary[j] = ary[j-1];
				ary[j-1] = x;
			}
		}
		
		
//		挿入ソートwhile ver	
		/*
		for (int i = 0; i < ary.length; i++) {
			int now = ary[i];
			int j = i - 1;
			while(j >= 0 && ary[j] > now) {
				ary[j + 1] = ary [j];
				j--;
			}
			
			ary[j + 1] = now;
		*/
		/*動作確認用
			System.out.println("");
			for (int k = 0; k < ary.length; k++) {
				System.out.print(ary[k] + " ");
			}
		*/
		/*
		}
		*/
		//5
		System.out.println("");
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i] + " ");
		}
	}

}
