package namudarbas8;

public class Vykdymas {

    public static void main(String[] args) {
        Point a = new Point (4, 3);
        System.out.println(a.distanceFromOrigin());
        Point p = new Point (0, 3);
        System.out.println(a.distance(p));


        Line line = new Line(a, p);
        System.out.println(line.getLineLength());


    }
}
