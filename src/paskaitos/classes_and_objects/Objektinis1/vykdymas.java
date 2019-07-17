package paskaitos.classes_and_objects.Objektinis1;

import paskaitos.classes_and_objects.Objektinis1.Preke;

public class vykdymas {
    public static void main(String[] args) {
        Preke p1 = new Preke("Obuolys", 0.60);
        p1.weight = 1.0;

        Preke p2 = new Preke("Kriause", 1.2, 1.0);


        System.out.println("Preke P1: " + p1);
        System.out.println("Preke P2: " + p2);

        System.out.println(p2.price(3.0));
        System.out.println(p1.price(3.0));
        System.out.println(p1.priceVat(2.0));
        System.out.println(p1.getPrice());

    }
}
