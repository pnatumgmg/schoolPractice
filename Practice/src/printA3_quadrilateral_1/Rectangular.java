package printA3_quadrilateral_1;

public class Rectangular extends Quadrilateral{
	int takasa;
	
	Rectangular(int yoko, int tate,int takasa) {
		super(yoko, tate);
		setTakasa(takasa);
	}
	
	void setTakasa(int takasa) {
		this.takasa = takasa;
	}
	
	int getTakasa() {
		return takasa;
	}
	
	@Override
	int getAreaOfFigure() {
		return 2 * (tate * yoko) + 2 * (tate * takasa) + 2 * (yoko * takasa);
	}
	
	int getVolume() {
		return tate * yoko * takasa;
	}

}
