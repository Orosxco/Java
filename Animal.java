class Animal {
    void eat() {
        System.out.println("eating...Animal class...eat method");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("Roar...Lion class...roar method");
    }
}

class Babylion extends Animal {
    void weep() {
        System.out.println("weeping...Babylion class...weeping method");
    }
}

class Main  {
    public static void main(String[] args) {
        Lion obj = new Lion();
        //obj.weep();
        obj.roar();
        obj.eat();
    }
}
