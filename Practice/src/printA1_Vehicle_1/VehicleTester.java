package printA1_Vehicle_1;

public class VehicleTester {
	public static void main(String[] args) {
		//2-2
		Vehicle bike = new Vehicle("バイク","黒",50);
		//2-3
		bike.drivingSpeed();
		//2-4
		bike.introduction();
		
		//5-1
		Car car = new Car("車","白",80,"トヨタ");
		Bicycle bicycle = new Bicycle("自動車","赤",15,3);
		//5-2
		car.drivingSpeed();
		bicycle.drivingSpeed();
		
		//5-3
		car.introduction();		
		bicycle.introduction();		
		
	}
	
	
	
	
}
