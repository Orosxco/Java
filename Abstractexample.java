abstract class Vehicle {
	String model;
	
	Vehicle(String model) {
		this.model = model;
	}
	void DisplayModel() {
		System.out.println("Vehicle model" + model);
	}
	
	abstract void start();
	
	abstract void stop();
	
	abstract void refuel();
}

class Car extends Vehicle {
	Car(String model) {
		super(model);
	}
	void start() {
		System.out.println(model + " starts with a button press");
	}
	void stop() {
		System.out.println(model + " stops with the brake pedal");
	}
	void refuel() {
		System.out.println(model + " is refueled with petrol");
	}
}

class electricvehicle extends Vehicle {
	electricvehicle(String model) {
		super(model);
	}
	void start() {
		System.out.println(model + " EV starts silently with a button press");
	}
	void stop() {
		System.out.println(model + " EV stops using regenerative braking");
	}
	void refuel() {
		System.out.println(model + " EV is charged using electricity");
	}
}
public class AbstractExample {

	public static void main(String[] args) {
		Vehicle v;
		
		v = new Car("Ford F150");
		v.DisplayModel();
		v.start();
		v.stop();
		v.refuel();
		
		System.out.println();
		
		v = new electricvehicle("BYD Yangwang U9");
		v.DisplayModel();
		v.start();
		v.stop();
		v.refuel();
		
		System.out.println();
	}

}
