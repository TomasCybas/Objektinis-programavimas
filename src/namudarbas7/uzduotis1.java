package namudarbas7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class uzduotis1 {
    public static void getSalaries(String filename) {
        try {
            Scanner filesc = new Scanner(new File(filename));
            int salary = 0;

            while (filesc.hasNext()){
                String name = "data/namudarbas7/" + filesc.next() + ".txt";
                Scanner sc = new Scanner(new File(name));
                for (int i = 0; i < 3; i++){
                    String tmp = sc.nextLine();
                }
                salary += sc.nextInt();
            }
            System.out.println(salary);
        } catch (FileNotFoundException e) {
            System.out.println("Sąraše yra pavardė, kurios failas nerastas");
        }
    }


    public static void printFileData() {
        try {
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
                getSalaries("data/namudarbas7/sarasas.txt");
                System.exit(1);
        }

        }catch (FileNotFoundException e) {
            System.out.println("Failas nerastas");
        }catch (InputMismatchException e){
            System.out.println("Faile pateikti netinkami duomenys");
        }
    }

    public static void main(String[] args) {
        printFileData();
    }
}

