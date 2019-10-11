package VehicleGarage;

public class Bus extends Vehicle{

	private double fare;
	
	public Bus() {
		
	}
	
	public Bus(String colour, int wheels, boolean roof, int amount) {
		this.setColour(colour);
		this.setNoOfWheels(wheels);
		this.setRoof(roof);
		this.fare = amount;
	}
	
	@Override
	public String toString() {
		return "Bus [colour=" + getColour() + ", noOfWheels=" + getNoOfWheels() + ", roof=" + isRoof() + ", fare=" + fare + "]";
	}
	
	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}
	
}
