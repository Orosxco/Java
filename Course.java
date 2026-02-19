class Course {
    String title;
    
    Course(String title) {
        this.title = title;
    }
    
    void getAccess() {
        System.out.println("Access granted to course: " + title);
    }
}

class PremiumCourse extends Course {
    
    PremiumCourse(String title) {
        super(title);
    }
    
    void getAccess() {
        System.out.println("Premium access granted to course: " + title);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Course c1 = new Course("Java Fundamentals");
        Course c2 = new PremiumCourse("Advanced Java");
        
        c1.getAccess();
        c2.getAccess();
    }
}
