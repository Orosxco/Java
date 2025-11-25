import java.util.Scanner;
public class StudentSystem {
    
// Global variables to store student info

static String name;
static int age;
static double gpa;

// Function 1: Add Student Information
public static void addInfo() {
Scanner sc = new Scanner(System.in);

System.out.print("Enter Student Name: ");
name = sc.nextLine();

System.out.print("Enter Age: ");
age = sc.nextInt();

System.out.print("Enter GPA: ");
gpa = sc.nextDouble();

System.out.println("\nStudent information added successfully!\n");
}

public static void showInfo() {
    System.out.println("\n----Student Information----");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("GPA: " + gpa);
    System.out.println("------------------------------\n");
}

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int choice;
    
    do {
        System.out.println("----MENU----");
        System.out.println("1. Add Information");
        System.out.println("2. Show Information");
        System.out.println("3. Exit");
        System.out.println("Choose an option: ");
        choice = sc.nextInt();
        sc.nextLine();
        
        switch(choice) {
            case 1:
                addInfo();
                break;
            
            case 2:
                showInfo();
                break;
                
            case 3:
                System.out.println("Exiting Program...");
                break;
                
            default:
            System.out.println("Invalid option! Try again.\n");
            
        }
    }
    while (choice != 3);
}
}
