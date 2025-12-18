interface Vehicle {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
class Bicycle implements Vehicle {
    int speed;
    int gear;
    
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }
    
    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }
    
    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
    
    public void printStates() {
        System.out.println("speed: " + speed + "gear: " + gear);
    }
}

class Car implements Vehicle {
    int speed;
    int gear;
    
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }
    
    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }
    
    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
    
    public void printStates() {
        System.out.println("speed: " + speed + "gear: " + gear);
    }
}

class Main {
    public static void main(String[] args) {
        Bicycle Bicycle = new Bicycle();
        Bicycle.changeGear(2);
        Bicycle.speedUp(3);
        Bicycle.applyBrakes(1);
        
        System.out.println("Bicycle present state: ");
        Bicycle.printStates();
        
        Car car = new Car();
        car.changeGear(1);
        car.speedUp(2);
        car.applyBrakes(1);
        
        System.out.println("Car present state: ");
        car.printStates();
    }
}
