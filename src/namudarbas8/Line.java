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
     * @return double
     */
    public double getLineLength(){
        double x1  = this.p1.getX();
        double x2 = this.p2.getX();
        double y1 = this.p1.getY();
        double y2 = this.p2.getY();
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
}
