import java.util.Scanner;
public class Restaurant_Order {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		int total= 0;
		
		while (choice != 4) {
			System.out.println("\nRestaurant Menu: ");
			System.out.println("1. Burger - 150");
			System.out.println("2. Pizza - 250");
			System.out.println("3. Fries - 100");
			System.out.println("4. Checkout");
			
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			
			if (choice == 4) {
				System.out.println("Checkout completed");
				break;
			}
			System.out.print("Enter quantity: ");
			int qty = sc.nextInt();
			
			switch (choice) {
			case 1:
				total += 150 * qty;
				break;
			case 2:
				total += 250 * qty;
				break;
			case 3:
				total += 100 * qty;
				break;
			default:
				System.out.println("Invalid Choice");
			}
			System.out.println("Current Total: " + total);
		}
		System.out.println("Final Bill: " + total);
		sc.close();
	}

}
