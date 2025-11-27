import java.util.Scanner;

public class SimpleGrading {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        
        int[] marks = new int[5];
        System.out.println("Enter marks for 5 subjects (0-100): ");
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        
        int total = marks[0] + marks[1] + marks[2] + marks[3] + marks[4];
        
        double average = total * 100 / 500;
        
        String grade;
        if (average >= 90) grade = "A+";
        else if (average >= 80) grade = "A";
        else if (average >= 70) grade = "B";
        else if (average >= 60) grade = "C";
        else if (average >= 50) grade = "D";
        else grade = "F";
        
        
        boolean pass = (marks[0] >= 40 && marks[1] >= 40 && marks[2] >= 40 && marks[3] >= 40 && marks[4] >= 40);
        
        System.out.println("\n----Result----");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2] + ", " + marks[3] + ", " + marks[4] + ", ");
        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + (pass ? "PASS" : "FAIL"));
    }
}
