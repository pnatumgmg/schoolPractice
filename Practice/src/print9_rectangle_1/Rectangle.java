package print9_rectangle_1;

//1
/**
 * 【長方形を表すクラス】
 */
public class Rectangle {
	//2-1
	private int width;
	private int height;
	
	//2-2
	public Rectangle(int width,int height) {
//		this.width  = width;
//		this.height = height;
		setWidth(width);
		setHeight(height);
		
	}
	
	//2-3
	int getWidth() {
		return this.width;
	}
	
	int getHeight() {
		return this.height;
	}
	
	void setWidth(int width) {
		this.width = width;
	}
	
	void setHeight(int height) {
		this.height = height;
	}
	
	void showSize() {
		System.out.println("幅は%d \n高さは%d\n".formatted(getWidth(),getHeight()));
	}
	
	int getArea() {
		return getWidth() * getHeight();
	}
	
	void showArea() {
		System.out.println("面積は%dです\n".formatted(getArea()));
	}
	
	//4
	//幅、高さを引数倍の数字に置き換え
	void expand(int mul) {
		this.height = getHeight() * mul;
		this.width  = getWidth() * mul;
	}
	
	//周囲の長さを戻り値で返す
	int perimeter() {
		int perimeter = (getHeight() + getWidth()) * 2;
		return perimeter;
	}
	
	//２つの要素のある配列Rectangleのheightが同値か検証
	static boolean isSame(Rectangle[] rectangles) {
		if (rectangles[0].height == rectangles[1].height)
			return true;
		else
			return false;
	}
	
	//２つのインスタンスの要素(heightとwidth)を入れ替え
	static void exchange(Rectangle a,Rectangle b) {
		int x = a.height;
		int y = a.width;
		a.height = b.height;
		a.width  = b.width;
		b.height = x;
		b.width  = y;
	}
	
	
}
