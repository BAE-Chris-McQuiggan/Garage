package models;

public class Motorbike extends Vehicle {

	private int noOfPassengers;
	private String bikeType;

	public Motorbike(String manufaturer, String model, String colour, int noOfWheels, String fuelType,
			String transmision, int noOfPassengers, String bikeType) {
		super(manufaturer, model, colour, noOfWheels, fuelType, transmision);
		this.bikeType = bikeType;
		this.noOfPassengers = noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	public int getNoOfPassengers() {
		return this.noOfPassengers;
	}

	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}

	public String getBikeType() {
		return this.bikeType;
	}

}
