package oop.hus.lab5.ballplayer;

public class Ball {
    private float x, y, z;

    public Ball(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String toString(){
        return String.format("(%f,%f,%f)", x, y, z);
    }
}
