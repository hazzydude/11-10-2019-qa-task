package VehicleGarage;

public class Car extends Vehicle{

	private int noOfPassengers;
	
	public Car() {
	}

	public Car(String colour, int wheels, boolean roof, int passengers) {
		this.setColour(colour);
		this.setNoOfWheels(wheels);
		this.setRoof(roof);
		this.noOfPassengers = passengers;
	}
	
	@Override
	public String toString() {
		return "Car [colour=" + getColour() + ", noOfWheels=" + getNoOfWheels() + ", roof=" + isRoof() + ", noOfPassengers=" + noOfPassengers + "]";
	}
	
	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
		
	
}
