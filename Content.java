abstract class Content {
    String title;
    int baseDuration;

    // Constructor
    Content(String title, int baseDuration) {
        this.title = title;
        this.baseDuration = baseDuration;
    }
    // Abstract Method
    abstract int calculateAccessTime();
}
// Subclass 1
class VideoContent extends Content {

    VideoContent(String title, int baseDuration) {
        super(title, baseDuration);
    }
    @Override
    int calculateAccessTime() {
        int accessTime = baseDuration;

        if (baseDuration > 60) {
            accessTime += 10; // Bonus time
        }

        return accessTime;
    }
}

// Subclass 2
class ArticleContent extends Content {

    ArticleContent(String title, int baseDuration) {
        super(title, baseDuration);
    }

    @Override
    int calculateAccessTime() {
        return baseDuration / 2;
    }
}

public class Main {
    public static void main(String[] args) {

        Content c1 = new VideoContent("Java Tutorial", 80);
        Content c2 = new ArticleContent("OOP Concepts", 30);

        System.out.println("Title: " + c1.title);
        System.out.println("Access Time: " + c1.calculateAccessTime() + " minutes");

        System.out.println();

        System.out.println("Title: " + c2.title);
        System.out.println("Access Time: " + c2.calculateAccessTime() + " minutes");
    }
}

