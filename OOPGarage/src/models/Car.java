package models;

public class Car extends Vehicle {

	private String carType;
	private int doors;

	public Car(String manufaturer, String model, String colour, int noOfWheels, String fuelType, String transmision,
			String carType, int doors) {
		super(manufaturer, model, colour, noOfWheels, fuelType, transmision);
		this.carType = carType;
		this.doors = doors;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCarType() {
		return this.carType;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getDoors() {
		return this.doors;
	}

}
