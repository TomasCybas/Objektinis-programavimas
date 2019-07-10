package paskaitos.loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class vykdymas {
    public static void main(String[] args) {
        System.out.println("col." + "\t" + "cm. \t" + "|" +"cm." + "\t\t" + "col.");
        for(int i = 1; i <= 10; i++){
            System.out.println(i + "\t\t" + i * 2.54 + "\t| " + i + " \t\t" + Math.round((i / 2.54)*100)/100.0);

        }
    }
}
