package oop.hus.lab5.ballplayer;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = 0.0f;
    }

    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public void jump(float zDisp) {
        this.z += zDisp;
    }

    public boolean near(Ball ball) {
        float distance = (float) Math.sqrt(Math.pow((ball.getX() - x), 2) + Math.pow((ball.getY() - y), 2));
        return distance < 8;
    }

    public void kick(Ball ball) {
        ball.setXYZ(x, y, 0.0f);
    }
}
