import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of cycles: ");
		int t = sc.nextInt();
		
		for (int i = 1; i <= t; i++) {
			System.out.println("Enter a number: ");
			int n = sc.nextInt();
			
			if (n <= 1) {
				System.out.println("Not Prime.");
				continue;
			}
			
			boolean isPrime = true;
			
			for (int div = 2; div * div <= n; div++) {
				if (n % div == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				System.out.println("Prime.");
			}
			else {
				System.out.println("Not Prime.");
			}
		}
		sc.close();
	}

}
