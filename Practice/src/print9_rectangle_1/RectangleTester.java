package print9_rectangle_1;

import java.util.Random;

//1
/**
 * 【Rectangleクラスを利用するクラス】
 */
public class RectangleTester {
	public static void main(String[] aegs) {
		//3-1
		//recAとrecBにコンストラクタを使い初期値を設定
		Rectangle recA = new Rectangle(4, 5);
		Rectangle recB = new Rectangle(7, 3);
		
		//3-2
		//recAとrecBの幅、高さ、面積を表示
		System.out.println("<recA>");
		recA.showSize();
		recA.showArea();
		System.out.println("<recB>");
		recB.showSize();
		recB.showArea();
		
		//5-1
		//recAの幅と高さを５倍
		System.out.println("<recA>");
		recA.expand(5);
		//recAを表示
		recA.showSize();
		
		//5-2
		//recBの周囲の長さを求めて表示
		System.out.println("<recB>");
		System.out.println("周囲の長さは%dです。\n".formatted(recB.perimeter()));
		
		//5-3
		//recAとrecBの幅、高さを入れ替え
		Rectangle.exchange(recA, recB);
		//入れ替えを行えているか表示
		System.out.println("<recA>");
		recA.showSize();
		System.out.println("<recB>");
		recB.showSize();
		
		//5-4
		//Rectangleの要素を２つ持つ配列を作成
		Rectangle[] rects = new Rectangle[2];
		
		//5-5
		Random rand = new Random();
		int x;
		int y;
		//ランダムな数字1-3をRectangleの幅、高さに代入
		for(int i = 0; i < 2; i++) {
			x = rand.nextInt(3) + 1;
			y = rand.nextInt(3) + 1;
			rects[i] = new Rectangle(x,y);
		}
		
		//5-6
		//isSameを使って2つのheigthが同値か検証
		System.out.println(Rectangle.isSame(rects));
		
	}

}
