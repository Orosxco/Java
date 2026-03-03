import java.util.*;

// Interface
interface Payment {
    void processPayment(double amount);
}

// Abstract Class
abstract class Ride {
    private String riderName;
    private double distance;

    Ride(String riderName, double distance) {
        this.riderName = riderName;
        this.distance = distance;
    }

    public String getRiderName() {
        return riderName;
    }

    public double getDistance() {
        return distance;
    }

    abstract double calculateFare();

    public void rideDetails() {
        double fare = calculateFare();
        System.out.println("Rider: " + riderName);
        System.out.println("Distance: " + distance);
        System.out.println("Fare: " + fare);
    }
}

// Economy Ride
class EconomyRide extends Ride implements Payment {

    EconomyRide(String riderName, double distance) {
        super(riderName, distance);
    }

    double calculateFare() {
        return 50 + (getDistance() * 10);
    }

    public void processPayment(double amount) {
        System.out.println("Payment of " + amount + " processed for Economy Ride.");
        System.out.println();
    }
}

// Premium Ride
class PremiumRide extends Ride implements Payment {

    PremiumRide(String riderName, double distance) {
        super(riderName, distance);
    }

    double calculateFare() {
        double fare = 100 + (getDistance() * 20);

        if (getDistance() > 20) {
            fare += 200;
        }

        return fare;
    }

    public void processPayment(double amount) {
        System.out.println("Payment of " + amount + " processed for Premium Ride.");
        System.out.println();
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double totalRevenue = 0;

        for (int i = 0; i < N; i++) {

            String type = sc.next();
            String name = sc.next();
            double distance = sc.nextDouble();

            Ride ride;

            // POLYMORPHISM
            if (type.equals("ECONOMY")) {
                ride = new EconomyRide(name, distance);
            } else {
                ride = new PremiumRide(name, distance);
            }

            ride.rideDetails();

            double fare = ride.calculateFare();
            totalRevenue += fare;

            // Interface polymorphism
            Payment payment = (Payment) ride;
            payment.processPayment(fare);
        }

        System.out.println("Total Revenue: " + totalRevenue);
    }
}

