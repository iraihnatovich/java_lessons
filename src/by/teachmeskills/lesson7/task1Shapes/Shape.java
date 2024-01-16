package by.teachmeskills.lesson7.task1Shapes;
//Написать иерархию классов «фигуры»
//Фигура - Треугольник - Прямоутольник - Круг - Квадрат
//Реализовать ф-ю подсчета площади для кажлого типа фигуры и подсчет периметра,
//Создать массив из 5 фигур. Вывести на экран сумму периметра всех фигур в массиве
abstract class Shape implements ShapeCalculation {
    double sideA; //указываю длину отрезка, в случае круга радиус

    // так как нет задачи рисовать фигуры -- мне кажется, нет смысла указывать точки x and y
    Shape(double sideA) {
        this.sideA = sideA;
    }
}
//  методы интерфейса в классах-наследниках

class Triangle extends Shape {
    double sideB;
    double sideC;

    Triangle(double sideA, double sideB, double sideC) {
        super(sideA);
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
    Circle(double sideA) {
        //sideA = radius
        super(sideA);
    }

    //C = 2 · π · r
    public double perimeter() {
        return 2 * Math.PI * sideA;
    }

    public double area() {
        // S = π × r2
        return Math.PI * Math.pow(sideA, 2);
    }
}

class Rectangle extends Shape {
    final double sideB;
    final double angle;

    Rectangle(double sideA, double sideB) {
        super(sideA);
        this.sideB = sideB;
        angle = 90;
    }

    Rectangle(double sideA) {// два коснтруктора, чтобы квадрат инициал только с 1 стороной
        super(sideA);
        sideB = sideA;
        angle = 90;
    }

    public double perimeter() {
        return (sideA + sideB) * 2;
    }

    public double area() {
        return sideA * sideB;
    }

}

class Square extends Rectangle {
    Square(double sideA) {
        super(sideA);
    }
    //можем не переопределять методы прямоуголника
}

class TestShapes {
    public static void main(String[] args) {
        Shape[] myShapes =
                {
                        new Triangle(3, 4, 6),
                        new Circle(102),
                        new Rectangle(4, 11),
                        new Rectangle(24),
                        new Square(13),
                };
        double perimeterOfAll = 0;
        for (int i = 0; i < myShapes.length; i++) {
            perimeterOfAll += myShapes[i].perimeter();
        }
        System.out.println(perimeterOfAll);

    }
}
