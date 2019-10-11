package VehicleGarage;

public class App {
	public static void main(String[] args) {
		
		Vehicle blueCar = new Car("blue",4,true,6);
		Vehicle redCar = new Car("red",4,true,2);
		Vehicle greenBike = new Motorbike("green",2,false,true);
		Vehicle yellowBus = new Bus("yellow",8,true,20);

		Garage thornburyMotors = new Garage();
		thornburyMotors.addVehicle(blueCar);
		thornburyMotors.addVehicle(redCar);
		thornburyMotors.addVehicle(greenBike);
		thornburyMotors.addVehicle(yellowBus);
		
		thornburyMotors.printAll();
	}
}
