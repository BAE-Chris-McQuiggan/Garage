package models;

public class QuadBike extends Vehicle {

	private Double wheelSize;
	private int noOfGears;
	private String suspentionType;

	public QuadBike(String manufaturer, String model, String colour, String fuelType, String transmision,
			Double wheelSize, int noOfGears, String suspentionType) {
		super(manufaturer, model, colour, 4, fuelType, transmision);
		this.wheelSize = wheelSize;
		this.noOfGears = noOfGears;
		this.suspentionType = suspentionType;

	}

	public void setWheelSize(Double wheelSize) {
		this.wheelSize = wheelSize;
	}

	public Double getWheelSize() {
		return this.wheelSize;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

	public int getNoOfGears() {
		return this.noOfGears;
	}

	public void setSuspentionType(String suspentionType) {
		this.suspentionType = suspentionType;
	}

	public String getSuspentionType() {
		return this.suspentionType;
	}

}
