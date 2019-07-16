package paskaitos.Exceptions.try2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Try2 {

    public static Integer getIntFromFile(String filepath) {
        Integer tmp = null;
        try {
            Scanner sc = new Scanner(new File(filepath));
            tmp = sc.nextInt();
        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas " + filepath);
        }

        return tmp;
    }

    public static void readData() {
        System.out.print("Atlyginimas: ");
        System.out.println(getIntFromFile("atlyginimas.txt"));
        System.out.print("Stazas");
        System.out.println(getIntFromFile("stazas.txt"));
    }

    public static void main(String[] args) {
        readData();
    }
}
