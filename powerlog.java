import java.util.Scanner;

public class PowerLog {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the base(x): ");
        int x = sc.nextInt();
        
        System.out.println("Enter the exponent(n): ");
        int n = sc.nextInt();
        
        int xpn = power(x , n);
        
        System.out.println("Result: " + xpn);
    }
    
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        
        int xpnb2 = power(x, n / 2);
        
        int xn = xpnb2 * xpnb2;
        
        if (n % 2 == 1) {
            xn = xn * x;
        }
        return xn;
    }
}
