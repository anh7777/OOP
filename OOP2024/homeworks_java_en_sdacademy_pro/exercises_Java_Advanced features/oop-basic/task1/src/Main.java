public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(10, 20);
        point2D.setXY(43, 65);
        System.out.println(point2D);
        Point3D point3D = new Point3D(10, 20, 30);
        point3D.setXYZ(43, 64, 2);
        System.out.println(point3D);
    }
}