import java.util.Scanner;
public class Eligibility_checker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.print("Do you have driving licence? (y/n): ");
		String driving = sc.nextLine();
		
		System.out.print("Do you have passport? (y/n): ");
		String passport = sc.nextLine();
		
		System.out.print("Do you have any National ID? (y/n): ");
		String ID = sc.nextLine();
		
		System.out.println("------Eligibility check results------");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		
		if (age >= 18 && driving.equalsIgnoreCase("yes")) {
			System.out.println("Age Eligibility for licence: Eligible");
		}
		else {
			System.out.println("Age Eligibility for license: Not Eligible");
		}
		
		if (age >= 18 && passport.equalsIgnoreCase("yes")) {
			System.out.println("Passport is Valid");
		}
		else if (age >= 18) {
			System.out.println("Passport Eligible but not available");
		}
		else {
			System.out.println("Not Eligible for Passport");
		}
		
		if (age >= 18 && ID.equalsIgnoreCase("yes")) {
			System.out.println("Valid National ID");
		}
		else if (age >= 18) {
			System.out.println("Eligible for National Id Not available");
		}
		else {
			System.out.println("Not Eligible for National Id");
		}
		sc.close();
	}

}
