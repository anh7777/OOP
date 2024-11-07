public class Main {
    public static void main(String[] args) {
        CircleGeometricObject circleGeometricObject = new CircleGeometricObject(14);
        System.out.println(circleGeometricObject.getArea());
        System.out.println(circleGeometricObject.getPerimeter());
        System.out.println(circleGeometricObject);
        Resizable resizable = new ResizableCircle(40);
        resizable.resize(30);
        System.out.println(resizable);
    }
}