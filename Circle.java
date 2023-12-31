class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getName() {
        return name;
    }

    public void draw() {
    }
}
