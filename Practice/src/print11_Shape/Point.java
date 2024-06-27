package print11_Shape;

public class Point extends Shape{
	
	@Override
	void draw() {
		System.out.println(getSymbol());
		System.out.println();
	}
}
