package namudarbas8;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Calculates line length between two given Points
     *
     * @return double
     */
    public double getLineLength() {
        return this.p1.distance(this.p2);
    }
}
