package printA3_quadrilateral_1;

import java.util.Scanner;

public class ShapeTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("「横 縦」の形で※半角スペースで数字を区切って１行で入力してください");
		int tate = sc.nextInt();
		int yoko = sc.nextInt();
		Quadrilateral sikaku = new Quadrilateral(tate,yoko);
		System.out.println("正方形のインスタンスを作成します。");
		System.out.println("一辺の長さを入力してください。");
		int hen = sc.nextInt();
		Square seihoukei = new Square(hen);
		System.out.println("「横 縦 高さ」の形で半角スペースで数字を区切って１行で入力してください");
		tate = sc.nextInt();
		yoko = sc.nextInt();
		int takasa = sc.nextInt();
		Rectangular chokuhoutai = new Rectangular(tate,yoko,takasa);
		System.out.println("立方体のインスタンスを作成します。");
		System.out.println("一辺の長さを入力してください。");
		hen = sc.nextInt();
		Cube rippoutai = new Cube(hen);
		sc.close();
		
		System.out.println("長方形の面積:" + sikaku.getAreaOfFigure());
		System.out.println("正方形の面積:" + seihoukei.getAreaOfFigure());
		System.out.println("直方体の表面積:" + chokuhoutai.getAreaOfFigure());
		System.out.println("直方体の体積:" + chokuhoutai.getVolume());
		System.out.println("立方体の表面積:" + rippoutai.getAreaOfFigure());
		System.out.println("立方体の体積:" + rippoutai.getVolume());	
	}
}
