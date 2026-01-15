import java.util.Scanner;
public class gradechecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Student name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter marks(0-100): ");
		int marks = sc.nextInt();
		
		if (marks < 0 || marks > 100) {
			System.out.println("Invalid Marks!");
		}
		else {
			char grade;
			if (marks >= 90) {
				grade = 'A';
			}
			else if (marks >= 80) {
				grade = 'B';
			}
			else if (marks >= 70) {
				grade = 'C';
			}
			else if (marks >= 60) {
				grade = 'D';
			}
			else {
				grade = 'F';
			}
			
			
			System.out.println("----------Student Results----------");
			System.out.println("Name: " + name);
			System.out.println("Grade: "+ grade);
			
			
			if (grade == 'F') {
				System.out.println("Fail");
			}
			else {
				System.out.println("Pass");
			}
		}	
		sc.close();
	}

}
