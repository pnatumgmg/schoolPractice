package print11_Shape;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Point poi = new Point();
		
		System.out.print("長方形の幅は：");
		int chouWidth = sc.nextInt();
		System.out.print("長方形の高さは:");
		int chouHeight = sc.nextInt();
		Rectangle rectan = new Rectangle(chouWidth,chouHeight);
		
		System.out.print("水平直線の長さは:");
		int heiLen = sc.nextInt();
		HorzLine heikouLen = new HorzLine(heiLen);
		
		System.out.print("垂直直線の長さは");
		int suiLen = sc.nextInt();
		VertLine suiheiLen = new VertLine(suiLen);
		
		sc.close();
		
		poi.draw();
		rectan.draw();
		heikouLen.draw();
		suiheiLen.draw();
	}
}