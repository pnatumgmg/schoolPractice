package printA1_Vehicle_1;

public class Bicycle extends Vehicle{
	//4-2
	private int gear;
	//4-3
	Bicycle(String kind,String color,int speed,int gear){
		super(kind,color,speed);
		setGear(gear);
	}
	//4-4
	void setGear(int gear) {
		this.gear = gear;
	}
	
	int getGear() {
		return this.gear;
	}
	//4-5
	@Override
	void introduction() {
		System.out.println("私の%sの色は%sです。ギアの数は%dです"
				.formatted(getKind(),getColor(),getGear()));
	}
}
