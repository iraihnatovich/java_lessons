package by.teachmeskills.lesson7.task1Shapes;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    //C = 2 · π · r
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        // S = π × r2
        return Math.PI * Math.pow(radius, 2);
    }
}
