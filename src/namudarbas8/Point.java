package namudarbas8;

public class Point {
    private Integer x;
    private Integer y;

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Calculates distance from 0,0 coordinate to point.
     * @return double
     */
    public double distanceFromOrigin(){
        return Math.sqrt((this.x * this.x) + (this.y * this.y));
    }

    public String toString(){
        return "[" + this.x + "," + this.y + "]";
    }

    /**
     * Moves point to a new location by adding given params to coordinates
     * @param x integer
     * @param y integer
     */
    public void translate(int x, int y){
        this.x += x;
        this.y += y;
    }

    /**
     * Calculates distance from point to another given point
     * @param p Point
     * @return double
     */
    public double distance(Point p){
       return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
    }

    /**
     * Sets a new location for the point with new given coordinates
     * @param x int
     * @param y int
     */
    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }
}
