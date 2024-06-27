package printA3_quadrilateral_1;

public class Quadrilateral {
	int yoko;
	int tate;
	
	Quadrilateral(int yoko,int tate){
		this.setYoko(yoko);
		this.setTate(tate);
	}
	
	void setYoko(int yoko) {
		this.yoko = yoko;
	}
	
	void setTate(int tate) {
		this.tate = tate;
	}
	
	int getYoko() {
		return this.yoko;
	}
	
	int getTate() {
		return this.tate;
	}
	
	int getAreaOfFigure(){
		return this.getTate() * this.getYoko();
	}

}
