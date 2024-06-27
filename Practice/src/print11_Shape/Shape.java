package print11_Shape;

public abstract class Shape {
	final private String SYMBOL = "+";
	final private String HORZLINE = "-";
//	final private String VERTLINE = "|";
	final private String VERTLINE = "|🐈";
	
	abstract void draw();
	
	String getSymbol() {
		return SYMBOL;
	}
	
	String getHorzline() {
		return HORZLINE;
	}
	
	String getVertline() {
		return VERTLINE;
	}
}
