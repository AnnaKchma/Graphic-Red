class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.name = "Circle";
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getName() {
        return name;
    }
}