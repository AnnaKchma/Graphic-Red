public class Quad extends Shape {
    private double sideLength;

    public Quad(double sideLength) {
        super("Quad");
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public String getName() {
        return name;
    }
}