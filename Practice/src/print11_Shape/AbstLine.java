package print11_Shape;

public abstract class AbstLine extends Shape{
	private int length; //直線の幅
	
	AbstLine(int length){
		setLength(length);
	}
	
	int getLength() {
		return this.length;
	}
	
	void setLength(int length){
		this.length = length;
	}
}
