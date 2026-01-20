import java.util.Scanner;

public class MarketshopBilling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of items you want to buy: ");
		int n = sc.nextInt();
		
		double total = 0;
		double discount = 0;
		double tax = 0;
		
		for (int i = 1; i <= n; i++) {
			
			System.out.print("\nEnter item name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter item category: 1=Food, 2=Clothes, 3=Electronics");
			int category = sc.nextInt();
			
			System.out.print("Enter item price: ");
			double price = sc.nextDouble();
			
			if (price <= 0) {
				System.out.println("Invalid price! Skipping this item");
				continue;
			}
			if (category < 1 || category > 3) {
				System.out.println("Invalid Category! Skipping this item");
				continue;
			}
			total += price;
			
			if (price >= 500) {
				discount += price * 0.10;
			}
			else if (price >= 200) {
				discount += price * 0.05;
			}
			switch (category) {
			case 1:
				tax += price * 0.05;
				break;
			case 2:
				tax += price * 0.10;
				break;
			case 3: 
				tax += price * 0.15;
				break;
			default:
				break;
			}
		if (total > 5000) {
			System.out.println("Thank you very much for shopping with us!");
			break;
		    }
		}
		
		double finalBill = total - discount + tax;
		
		System.out.println("--------Bill Summary--------");
		System.out.println("Total: " + total);
		System.out.println("Discount: " + discount);
		System.out.println("tax: " + tax);
		System.out.println("Final price: "+ finalBill);
		
		sc.close();
	}

}
