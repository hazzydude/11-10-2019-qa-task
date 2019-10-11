package VehicleGarage;

public class Motorbike extends Vehicle {
	
	private boolean helmet;
	
	public Motorbike() {
	}

	public Motorbike(String colour, int wheels, boolean roof,boolean helmet) {
		this.setColour(colour);
		this.setNoOfWheels(wheels);
		this.setRoof(roof);
		this.helmet = helmet;
	}
	@Override
	public String toString() {
		return "Motorbike [colour=" + getColour() + ", noOfWheels=" + getNoOfWheels() + ", roof=" + isRoof() + ", helmet=" + helmet + "]";
	}
	
	public boolean isHelmet() {
		return helmet;
	}

	public void setHelmet(boolean helmet) {
		this.helmet = helmet;
	}

	

}