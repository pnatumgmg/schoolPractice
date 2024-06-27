package print11_Shape;

public class Rectangle extends Shape{
	private int width;  //幅
	private int height; //高さ
	
	Rectangle(int width,int height){
		this.setWigth(width);
		this.setHeight(height);
	}
	
	void setWigth(int width){
		this.width = width;
	}
	
	void setHeight(int height) {
		this.height = height;
	}
	
	int getWigth() {
		return this.width;
	}
	
	int getHeight() {
		return this.height;
	}
	
	@Override
	void draw() {
		int w = getWigth();
		int h = getHeight();
		
		for (int i = 0; i < h; i++) {
			for (int k = 0; k < w; k++) {
				System.out.print(getSymbol());
			}
			System.out.println();
		}
		System.out.println();
	}
}
