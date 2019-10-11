package VehicleGarage;

public abstract class Vehicle {

	private String colour;
	private int noOfWheels;
	private boolean roof;
	
	public Vehicle() {
	}
	
	public Vehicle(String colour, int wheels, boolean roof) {
		super();
		this.colour=colour;
		this.noOfWheels=wheels;
		this.roof=roof;
	}
	

	
	@Override
	public String toString() {
		return "Vehicle [colour=" + colour + ", noOfWheels=" + noOfWheels + ", roof=" + roof + "]";
	}

	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public boolean isRoof() {
		return roof;
	}
	public void setRoof(boolean roof) {
		this.roof = roof;
	}
	

	
	
}
