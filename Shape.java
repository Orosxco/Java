class Shape {
    public double getArea() {
        return 0;
    }
}
class Triangle extends Shape {
    private double base;
    private double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getArea() {
        return 0.5 * base * height;
    }
}
class Square extends Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }
}
class Main {
    public static void main(String[] args) {
        Shape[] Shape = new Shape[2];
        Shape[0] = new Square(5);
        Shape[1] = new Triangle(2,2);
        
        System.out.println("Area of the Square: " + Shape[0].getArea());
        System.out.println("Area of the Triangle: " + Shape[1].getArea());
    }
}
