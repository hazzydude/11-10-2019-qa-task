package VehicleGarage;

import java.util.ArrayList;



public class Garage {
	
private ArrayList <Vehicle> garage = new ArrayList<>();


	public void addVehicle(Vehicle vehicle) {
		garage.add(vehicle);
	}
	public void removeVehicle(Vehicle vehicle) {
		garage.remove(vehicle);
	}
	
	public int billCalc(Vehicle vehicle) {
		if (vehicle instanceof Motorbike) {
			return 80;
		} else if (vehicle instanceof Car) {
			return 100;
		} else if (vehicle instanceof Bus) {
			return 200;
		} else {
			System.out.println("We do not service other vehicle types");
			return 0;
		}
		
	}
	
	
	public void printAll() {
		for (Vehicle v : this.garage) {
			System.out.println(v);
		}
	}
	
	
	public void emptygarage(){
		for (Vehicle v : this.garage) {
			garage.remove(v);
		}
	}
	
	
	
}
