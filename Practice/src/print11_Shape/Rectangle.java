package print11_Shape;

public class Rectangle extends Shape{
	private int width;  //幅
	private int height; //高さ
	
	Rectangle(int width,int height){
		this.setWidth(width);
		this.setHeight(height);
	}
	
//	void setWigth(int width){
//		this.width = width;
//	}
//	
//	void setHeight(int height) {
//		this.height = height;
//	}
//	
//	int getWigth() {
//		return this.width;
//	}
//	
//	int getHeight() {
//		return this.height;
//	}
	
	@Override
	void draw() {
		int w = this.getWidth();
		int h = this.getHeight();
		
		for (int i = 0; i < h; i++) {
			for (int k = 0; k < w; k++) {
				System.out.print(getSymbol());
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * @return width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width セットする width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height セットする height
	 */
	public void setHeight(int height) {
		this.height = height;
	}
}
