package paskaitos.Generic;

public class Vykdymas {
    public static void main(String[] args) {
        Loterija<Darbuotojas> l = new Loterija<>();
        l.data = new Darbuotojas[5];

        l.data[0] = new Darbuotojas("Petras", "Jonaitis");
        l.data[1] = new Darbuotojas("Antanas", "Jonaitis");
        l.data[2] = new Darbuotojas("Jurgis", "Jonaitis");
        l.data[3] = new Darbuotojas("Aloyzas", "Jonaitis");
        l.data[4] = new Darbuotojas("Jonas", "Jonaitis");

        Darbuotojas laimetojas = l.getWinner();
        System.out.println(laimetojas.name);
    }
}
