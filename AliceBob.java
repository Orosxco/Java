import java.util.ArrayList; 
class Course { 
    private String name; 
    private int credits; 
    private double grade; 
    
    public Course(String name, int credits) { 
        this.name = name; 
        this.credits = credits; 
        this.grade = 0.0; 
    } 
    
    public void setGrade(double grade) { 
        this.grade = grade; 
    } 
    
    public double getGrade() {
        return grade; 
    } 
    
    public int getCredits() { 
        return credits; 
    } 
    
    public String getName() { 
        return name;
        } 
       
    public String getLetterGrade() {
        if (grade >= 4.0) return "A";
        else if (grade >= 3.7) return "A-";
        else if (grade >= 3.3) return "B+";
        else if (grade >= 3.0) return "B";
        else if (grade >=2.7) return "B-";
        else return "C";
    }
}

class Student {
    private String name;
    private int id; 
    private ArrayList<Course> courses;
    
    public Student(String name, int id) { 
        this.name = name;
        this.id = id; 
        courses = new ArrayList<>(); 
        
    } 
    
    public void addCourse(Course course) { 
        courses.add(course); 
        
    }
    public void removeCourse(Course course) { 
        courses.remove(course); 
        
    }
        
    public double getGPA() { 
        if (courses.isEmpty()) return 0.0;
        double total = 0;
        for (Course course : courses) { 
            total += course.getGrade();
            
        } 
        return total / courses.size();
    } 
    
    public String getTranscript() {
        StringBuilder transcript = new StringBuilder();
        transcript.append("Name: ").append(name).append("\n");
        transcript.append("ID: ").append(id).append("\n");
        
        for (Course course: courses) {
            transcript.append("Course: ").append(course.getName()).append("(").append(course.getCredits()).append("credits)\n").append("Grade: ").append(course.getGrade()).append("(").append(course.getLetterGrade()).append(")\n\n");
        }
        return transcript.toString();
    }
} 

public class Main {
    public static void main(String[] args) {
        Course cs = new Course("Computer Science", 4);
        cs.setGrade(3.7);
        
        Student alice = new Student("Alice", 1234);
        alice.addCourse(cs);
        System.out.println("Alice's initial GPA: " + alice.getGPA());
        
        Course math = new Course("Math", 3);
        alice.addCourse(math);
        math.setGrade(4.0);
        System.out.println("ALice's Updated GPA: " + alice.getGPA());
        
        Course csbob = new Course("Computer Science", 4);
        csbob.setGrade(3.0);
        
        Student Bob = new Student("Bob", 1234);
        Bob.addCourse(csbob);
        System.out.println("Bob's initial GPA: " + Bob.getGPA());
        
        Course mathbob = new Course("Math", 3);
        Bob.addCourse(math);
        mathbob.setGrade(3.5);
        System.out.println("Bob's Updated GPA: " + Bob.getGPA());
        
    }
}
