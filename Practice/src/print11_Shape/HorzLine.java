package print11_Shape;

public class HorzLine extends AbstLine{
	HorzLine(int length){
		super(length);
	}
	
	@Override
	void draw() {
		int l = getLength();
		
		for(int i = 0; i < l; i++) {
			System.out.print(getHorzline());
		}
		System.out.println();
		System.out.println();
	}
}
