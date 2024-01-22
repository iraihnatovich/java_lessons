package by.teachmeskills.lesson7.task1Shapes;

public class Rectangle extends Shape {
    protected final double sideA;
    protected final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double perimeter() {
        return (sideA + sideB) * 2;
    }

    public double area() {
        return sideA * sideB;
    }

}
