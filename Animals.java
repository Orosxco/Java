class Animal {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
        super.sound();
    }
}
public class Main {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.sound();
    }
}
