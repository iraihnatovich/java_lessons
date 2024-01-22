package by.teachmeskills.lesson7.task1Shapes;

public class TestShapes {
    public static void main(String[] args) {
        Shape[] myShapes =
                {
                        new Triangle(3, 4, 6),
                        new Circle(102),
                        new Rectangle(4, 11),
                        new Square(13),
                        new Square(20),
                };
        double perimeterOfAll = 0;
        for (int i = 0; i < myShapes.length; i++) {
            perimeterOfAll += myShapes[i].perimeter();
        }
        System.out.println(perimeterOfAll);
    }
}
