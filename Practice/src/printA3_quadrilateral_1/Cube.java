package printA3_quadrilateral_1;

public class Cube extends Rectangular{

	Cube(int hen) {
		super(hen, hen, hen);
	}
	
	@Override
	int getAreaOfFigure() {
		return tate * yoko * 6;
	}

}
