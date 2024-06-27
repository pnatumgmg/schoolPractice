package print11_Shape;

public class VertLine extends AbstLine{
	VertLine(int length){
		super(length);
	}
	
	void draw(){
		int l = getLength();
		
		for (int i = 0; i < l; i++) {
			System.out.println(getVertline());
		}
	}

}
