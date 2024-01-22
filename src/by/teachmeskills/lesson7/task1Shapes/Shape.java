package by.teachmeskills.lesson7;

 class Shape {
    double sideA; //line
    Shape (double sideA){
        this.sideA = sideA;
    }
     double perimeter (){
         return sideA; // возвр длину отрезка
     }
     double area(){
         return 0; // 0 ибо это линия
     }

}

class Triangle extends Shape{
    double sideB;
    double sideC;
    Triangle ( double sideA, double sideB, double sideC){
        super(sideA);
        this.sideB = sideB;
        this.sideC = sideC;
    }

    double perimeter (){
        return sideA+ sideB + sideC;
    }

    double area (){
        double p = perimeter()/2;
        return  Math.sqrt( p*(p - sideA)*(p - sideB)*(p - sideC)) ;
    }
}

class Circle extends Shape{
    Circle ( double sideA){
        //sideA = circumference length
        super(sideA);
    }
    //C = 2 · π · r
    //parameter as in class Shape
    double area(){
        // R = P/2pi
        double radius = sideA/(2*Math.PI);
        // S = π × r2
        return Math.PI*Math.pow(radius,2);
    }
}
class Rectangle extends Shape {
    final double sideB;
    final double angle;
    Rectangle (double sideA, double sideB){
        super(sideA);
        this.sideB = sideB;
         angle = 90;
    }
    Rectangle (double sideA){// два коснтруктора, чтобы квадрат инициал только с 1 стороной
        super(sideA);
        sideB = sideA;
        angle = 90;
    }
    double perimeter (){
        return (sideA+sideB)*2;
    }
    double area(){
        return sideA*sideB;
    }

}
class Square extends Rectangle{
     Square ( double sideA){
         super( sideA);
    }
    //можем не переопределять методы прямоуголника
}

class TestShapes{
    public static void main(String[] args) {
        Shape [] myShapes =
        {
                new Shape(12),
                new Triangle( 3,4,6),
                new Circle( 102),
                new Rectangle( 4,11),
                new Square (13),
        };
        int perimeterOfAll = 0;
        for (int i = 0; i < myShapes.length; i++) {
            perimeterOfAll += myShapes[i].perimeter();
        }
        System.out.println(perimeterOfAll);

    }
}
