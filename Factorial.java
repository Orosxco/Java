import java.util.Scanner;

public class Factorial {
    
    //main method - Entry point of the program
    public static void main(String[] args) {
        //create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        //reading the integer input (n) to calculate its factorial
        System.out.println("Enter a number to calculate its factorial: ");
        int n = sc.nextInt();
        
        //calling the factorial method and calculating the result
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
    //method to calculate the factorial of a number
    public static int factorial(int n) {
        //base case: if n is 0 or 1 return 1
        if (n == 0 || n == 1) {
            return 1;
        }
        //recursive case: n * factorial(n - 1)
        return n * factorial(n - 1);
    }
}
