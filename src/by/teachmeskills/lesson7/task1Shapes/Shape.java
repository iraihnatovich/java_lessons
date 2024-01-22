package by.teachmeskills.lesson7.task1Shapes;

//Написать иерархию классов «фигуры»
//Фигура - Треугольник - Прямоутольник - Круг - Квадрат
//Реализовать ф-ю подсчета площади для кажлого типа фигуры и подсчет периметра,
//Создать массив из 5 фигур. Вывести на экран сумму периметра всех фигур в массиве
abstract class Shape implements ShapeCalculation {

}

class Triangle extends Shape {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }

    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}

class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
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

class Rectangle extends Shape {
    protected final double sideA;
    protected final double sideB;

    Rectangle(double sideA, double sideB) {
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

class Square extends Rectangle {
    Square(double sideA, double sideB) {
        super(sideA, sideB);
    }

    public double perimeter() {
        return sideA * 4;
    }

    public double area() {
        return sideA * sideA;
    }
}

class TestShapes {
    public static void main(String[] args) {
        Shape[] myShapes =
                {
                        new Triangle(3, 4, 6),
                        new Circle(102),
                        new Rectangle(4, 11),
                        new Square(13, 13),
                        new Square(20, 20),
                };
        double perimeterOfAll = 0;
        for (int i = 0; i < myShapes.length; i++) {
            perimeterOfAll += myShapes[i].perimeter();
        }
        System.out.println(perimeterOfAll);

    }
}
