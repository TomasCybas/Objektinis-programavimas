package namudarbas7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class uzduotis1 {
    public static void getSalaries(String filename) throws FileNotFoundException {
        Scanner filesc = new Scanner(new File(filename));
        int salary = 0;

        while (filesc.hasNext()){
            String name = "data/namudarbas7/" + filesc.next() + ".txt";
            Scanner sc = new Scanner(new File(name));
            System.out.println(sc.next());
        }
    }


    public static void printFileData() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite pavarde: ");
        String filename = "data/namudarbas7/" + sc.next() + ".txt";
        Scanner scfile = new Scanner(new File(filename));
        while (scfile.hasNext()) {
            System.out.println(scfile.nextLine());
        }
        System.out.println("Ar norite tęsti darbą?  Y/N");
        String tmp = sc.next();
        if (tmp.equals("Y") || tmp.equals("y") || tmp.equals("yes")) {
            printFileData();
        } else {
          /*  System.out.println(getSalaries("data/namudarbas7/sarasas.txt"));*/
            System.out.println("Darbas baigtas");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        printFileData();
        getSalaries("data/namudarbas7/sarasas.txt");
    }

}
