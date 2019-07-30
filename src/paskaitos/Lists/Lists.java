package paskaitos.Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<Integer> temps = new ArrayList<>();
        temps.add(10);
        temps.add(14);
        temps.add(-12);
        System.out.println(temps.get(1));

        List<Darbuotojas> darbuotojai = new ArrayList<>();
        darbuotojai.add(new Darbuotojas("Petras", "Petraitis"));
        darbuotojai.add(new Darbuotojas("Jonas", "Petraitis"));
        darbuotojai.add(new Darbuotojas("Antanas", "Petraitis"));
        darbuotojai.add(new Darbuotojas("Kazys", "Petraitis"));

        for(Darbuotojas i : darbuotojai){
        }
    }
}
