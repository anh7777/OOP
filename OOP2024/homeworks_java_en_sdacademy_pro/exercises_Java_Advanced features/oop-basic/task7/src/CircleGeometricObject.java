class CircleGeometricObject implements GeometricObject {
    protected float radius;
    public CircleGeometricObject(float radius) {
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return "CircleGeometricObject{" +
                "radius=" + radius +
                '}';
    }
}
