class Line {

    private Point2DExt p1, p2;

    public Line(Point2DExt p1, Point2DExt p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(float p1Start, float p1End, float p2Start, float
            p2End) {
        this.p1 = new Point2DExt(p1Start, p1End);
        this.p2 = new Point2DExt(p2Start, p2End);
    }

    public Point2DExt getP1() {
        return p1;
    }

    public void setP1(Point2DExt p1) {
        this.p1 = p1;
    }

    public Point2DExt getP2() {
        return p2;
    }

    public void setP2(Point2DExt p2) {
        this.p2 = p2;
    }

    public float getLength() {
        return (float) Math.sqrt((Math.pow(p2.x - p1.x, 2) +
                Math.pow(p2.y - p1.y, 2)));
    }

    public Point2DExt getMiddlePoint() {
        float xMiddle = (p1.x + p2.x) / 2;
        float yMiddle = (p1.y + p2.y) / 2;
        return new Point2DExt(xMiddle, yMiddle);
    }
}