package oop.hus.exe1.point;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public Point3D(){
        super();
        this.z = 0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr = new float[3];
        arr[0] = getXY()[0];
        arr[1] = getXY()[1];
        arr[2] = getZ();
        return arr;
    }
}
