class Vehicle {
    String brand = "Pagani";
    
    void honk() {
        System.out.println("Beep Beep!");
    }
}

class Car extends Vehicle {
    String modelName = "Zonda";
    String BodyType = "Coupe'";
    
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + modelName);
        System.out.println("Body Type: " + BodyType);
    }
}

public class Main {
    public static void main(String[] args) {
        Car Dreamcar = new Car();
        Dreamcar.honk();
        Dreamcar.displayInfo();
    }
}
