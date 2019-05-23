import java.util.stream.Collectors;

import models.Car;
import models.Garage;
import models.Motorbike;
import models.QuadBike;

public class Runner {

	public static void main(String[] args) {
		Car polo = new Car("VW", "Polo", "Black", 4, "Petrol", "Manual", "Hatchback", 5);
		Car mazda3 = new Car("Mazda", "Mazda3", "Navey", 4, "Deisel", "Manual", "Fastback", 4);
		QuadBike raptor = new QuadBike("Yamaha", "Raptor", "Blue", "Petrol", "Auto", 15.0, 5, "external");
		QuadBike blade = new QuadBike("Tgb", "Blade", "Camo", "Petrol", "Auto", 12.0, 3, "internal");
		Motorbike bonneville = new Motorbike("Triumph", "Bonneville", "Black", 2, "Petrol", "Manual", 1, "Upright");
		Motorbike electricDirtBike = new Motorbike("Renegade", "Electric Dirt Bike", "Black & Green", 2, "Electric",
				"Auto", 0, "Off-Road");

		Garage house = new Garage();
		house.vehicleList.add(polo);
		house.vehicleList.add(mazda3);
		house.vehicleList.add(raptor);
		house.vehicleList.add(blade);
		house.vehicleList.add(bonneville);
		house.vehicleList.add(electricDirtBike);

		house.vehicleList.stream().collect(Collectors.toList()).forEach(System.out::println);
		house.bill();
		house.removeVehicles("Car");
		house.repaireBill(3);
		house.addVehicle("QuadBike", "Yamaha", "bogus", "red", 4, "Electric", "Auto", 15.0, 0, "Internal");
		house.removeAllVehicles();
		// System.out.println((((Motorbike) house.vehicleList.get(5)).getBikeType()));
	}

}
