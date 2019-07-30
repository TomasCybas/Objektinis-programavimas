package namudarbas13.Uzduotis1;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Execute {
    public static void main(String[] args) {

        try {
            File file = new File("data/namudarbas13/temperaturos.txt");
            Scanner sc = new Scanner(file);
            List<Integer> temperatures = new ArrayList<>();

            while (sc.hasNextInt()) {
                temperatures.add(sc.nextInt());
            }
            sc.close();
            Integer max = Collections.max(temperatures);
            Integer min = Collections.min(temperatures);
            double sum = 0;
            for (int i: temperatures) {
                sum += i;
            }
            double average = (sum / temperatures.size());
            NumberFormat format = new DecimalFormat("#.##");

            System.out.println("Mažiausia temperatūra: " + min);
            System.out.println("Didžiausia temperatūra: " + max);
            System.out.println("Vidutinė temperatūra: " + format.format(average));


        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
