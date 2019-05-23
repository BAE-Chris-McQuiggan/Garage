package models;

import java.util.ArrayList;

public class Garage {

	public ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public void bill() {
		double value = 0;
		for (int i = 0; i < vehicleList.size(); i++) {

			if (vehicleList.get(i).getClass().getCanonicalName().equals("models.Car")) {
				value = vehicleList.get(i).getNoOfWheels() * 250;
				if ((vehicleList.get(i).getFuelType() == "Electric")) {
					value *= 1.3;
				}
				if (vehicleList.get(i).getManufaturer() == "Mazda") {
					value *= 0.9;
				} else if (vehicleList.get(i).getManufaturer() == "VW") {
					value *= 1.1;
				}

			} else if (vehicleList.get(i).getClass().getCanonicalName().equals("models.QuadBike")) {
				value = vehicleList.get(i).getNoOfWheels() * 100;
				if (((QuadBike) vehicleList.get(i)).getSuspentionType() == "internal") {
					value *= 1.6;
				}
				if ((vehicleList.get(i).getFuelType() == "Electric")) {
					value *= 1.3;
				}

			} else if (vehicleList.get(i).getClass().getCanonicalName().equals("models.Motorbike")) {
				value = vehicleList.get(i).getNoOfWheels() * 250;
				if ((vehicleList.get(i).getFuelType() == "Electric")) {
					value *= 1.3;
				}
				if ((((Motorbike) vehicleList.get(i)).getBikeType() == "Off-Road")) {
					value = (value + 500) * 1.1;
				}
			} else {
				System.out.println("Vehicle type not known. Return zero.");
			}
			System.out.println("Bill for " + vehicleList.get(i).getManufaturer() + " " + vehicleList.get(i).getModel()
					+ " £" + value);
		}

	}

	public void addVehicle(String vehicleTypeCar, String manufacturer, String model, String colour, int noOfWheels,
			String fuelType, String transmision, String carType, int doors) {

		if (vehicleTypeCar == "Car") {
			Car carID = new Car(manufacturer, model, colour, noOfWheels, fuelType, transmision, carType, doors);
			this.vehicleList.add(carID);
			System.out.println("Car added to list");
		} else {
			System.out.println("Inputs given are for a car.");
		}
	}

	public void addVehicle(String vehicleTypeQuadBike, String manufacturer, String model, String colour, int noOfWheels,
			String fuelType, String transmision, Double wheelSize, int noOfGears, String suspentionType) {
		if (vehicleTypeQuadBike == "QuadBike") {
			QuadBike quadID = new QuadBike(manufacturer, model, colour, fuelType, transmision, wheelSize, noOfGears,
					suspentionType);
			this.vehicleList.add(quadID);
			System.out.println("Quad bike added to list");
		} else {
			System.out.println("Inputs given are for a quad bike.");
		}
	}

	public void addVehicle(String vehicleTypeMotorbike, String manufacturer, String model, String colour,
			int noOfWheels, String fuelType, String transmision, int noOfPassengers, String bikeType) {
		if (vehicleTypeMotorbike == "Motorbike") {
			Motorbike bikeID = new Motorbike(manufacturer, model, colour, noOfWheels, fuelType, transmision,
					noOfPassengers, bikeType);
			this.vehicleList.add(bikeID);
			System.out.println("Motorbike added to list");
		} else {
			System.out.println("Inputs given are for a motorbike.");
		}
	}

	public void removeVehicles(String vehicleType) {
		for (int i = 0; i < vehicleList.size(); i++) {
			if (vehicleList.get(i).getClass().getCanonicalName().equals("models." + vehicleType)) {
				vehicleList.remove(i);
				i -= 1;
				System.out.println("all" + vehicleType + "s" + " were removed.");
			}
		}
	}

	public void removeVehicles(int index) {
		vehicleList.remove(index);
	}

	public void removeAllVehicles() {
		for (int i = vehicleList.size() - 1; i >= 0; i--) {
			System.out.println("Removing " + vehicleList.get(i).getManufaturer() + " " + vehicleList.get(i).getModel());
			vehicleList.remove(i);
		}
	}

	public double repaireBill(int VehicleIndex) {
		double value = 0;

		if (vehicleList.get(VehicleIndex).getClass().getCanonicalName().equals("models.Car")) {
			value = vehicleList.get(VehicleIndex).getNoOfWheels() * 250;
			if ((vehicleList.get(VehicleIndex).getFuelType() == "Electric")) {
				value *= 1.3;
			}
			if (vehicleList.get(VehicleIndex).getManufaturer() == "Mazda") {
				value *= 0.9;
			} else if (vehicleList.get(VehicleIndex).getManufaturer() == "VW") {
				value *= 1.1;
			}

		} else if (vehicleList.get(VehicleIndex).getClass().getCanonicalName().equals("models.QuadBike")) {
			value = vehicleList.get(VehicleIndex).getNoOfWheels() * 100;
			if (((QuadBike) vehicleList.get(VehicleIndex)).getSuspentionType() == "internal") {
				value *= 1.6;
			}
			if ((vehicleList.get(VehicleIndex).getFuelType() == "Electric")) {
				value *= 1.3;
			}

		} else if (vehicleList.get(VehicleIndex).getClass().getCanonicalName().equals("models.Motorbike")) {
			value = vehicleList.get(VehicleIndex).getNoOfWheels() * 250;
			if ((vehicleList.get(VehicleIndex).getFuelType() == "Electric")) {
				value *= 1.3;
			}
			if ((((Motorbike) vehicleList.get(VehicleIndex)).getBikeType() == "Off-Road")) {
				value = (value + 500) * 1.1;
			}
		} else {
			System.out.println("Vehicle type not known. Return zero.");
		}
		System.out.println("Bill for " + vehicleList.get(VehicleIndex).getManufaturer() + " "
				+ vehicleList.get(VehicleIndex).getModel() + " £" + value);

		return value;

	}

}
