import java.util.Scanner;
class Main{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("your name: "+ name);
        
        int age = 15;
        double marks = 97;
        String subject = "Mathematics";
        System.out.println("Age: "+ age);
        System.out.println("Marks: "+ marks);
        System.out.println("Subject: "+ subject);
        int x = 67;
        int y = 33;
        int sum = x + y;
        System.out.println("Sum of 67 and 33 is "+ sum);
    }
}
