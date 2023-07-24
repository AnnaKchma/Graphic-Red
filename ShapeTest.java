public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Quad quad = new Quad(10.0);
        Triangle triangle = new Triangle(6.0, 8.0);
        Rectangle rectangle = new Rectangle(4.0, 7.0);

        circle.draw();
        quad.draw();
        triangle.draw();
        rectangle.draw();

        ShapeTitlePrinter.printTitle(circle);
        ShapeTitlePrinter.printTitle(quad);
        ShapeTitlePrinter.printTitle(triangle);
        ShapeTitlePrinter.printTitle(rectangle);
    }
}
