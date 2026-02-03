class Vehicle {
	int speed = 180;
	void start() {
		System.out.println("Vehicle is Starting");
	}
}

class Car extends Vehicle {
	void CarInfo() {
		System.out.println("This is Car Info");
		System.out.println("Car Speed: " + speed + "km/h");
		System.out.println("Car Name: Mercedes S65 AMG");
	}
}

class Bike extends Vehicle {
	void BikeInfo() {
		System.out.println("This is Bike Info");
		System.out.println("Bike speed: " + speed + "km/h");
		System.out.println("Bike name: Yamaha R6");
	}
}

public class Hierar_Example {

	public static void main(String[] args) {
		Car carobj = new Car();
		Bike bikeobj = new Bike();
		carobj.CarInfo();
		bikeobj.BikeInfo();
	}

}
