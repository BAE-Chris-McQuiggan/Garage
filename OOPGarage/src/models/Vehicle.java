package models;

public abstract class Vehicle {

	private String manufaturer;
	private String model;
	private String vehicleColour;
	private int noOfWheels;
	private String fuelType;
	private String transmision;

	public Vehicle(String manufaturer, String model, String vehicleColour, int noOfWheels, String fuelType,
			String transmision) {
		this.manufaturer = manufaturer;
		this.model = model;
		this.vehicleColour = vehicleColour;
		this.noOfWheels = noOfWheels;
		this.fuelType = fuelType;
		this.transmision = transmision;
	}

	public void setManufaturer(String manufaturer) {
		this.manufaturer = manufaturer;
	}

	public String getManufaturer() {
		return this.manufaturer;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return this.model;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getNoOfWheels() {
		return this.noOfWheels;
	}

	public void setVehicleColour(String vehicleColour) {
		this.vehicleColour = vehicleColour;
	}

	public String getColour() {
		return this.vehicleColour;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getFuelType() {
		return this.fuelType;
	}

	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}

	public String getTransmision() {
		return this.transmision;
	}

	@Override
	public String toString() {
		return (manufaturer + ", " + model + ", " + "Colour: " + vehicleColour);
	}

}
