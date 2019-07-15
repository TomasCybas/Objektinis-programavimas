package namudarbas5.Papildoma;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Papildoma {
    public static void main(String[] args) throws FileNotFoundException {
            //Scanner sc = new Scanner(new File("data.txt"));
            Scanner sc = new Scanner(System.in);

            System.out.println("Iveskite sandeliu kieki: ");
            int n = sc.nextInt();
            int[] warehouses = new int[n];
            int maxLoad = 0;
            for (int i = 0; i < warehouses.length; i++) {
                // ivedamas kroviniu kiekis iš sandelio:
                System.out.println("iveskite kroviniu kieki isvezama is " + (i+1) + "-ojo sandėlio");
                int loads = sc.nextInt();
                for (int j = 1; j <= loads; j++) {
                    System.out.println("iveskite i kuri sandeli vezamas" + j +  "-asis krovinys: ");
                    int destination = sc.nextInt();
                    System.out.println("Iveskite" + j + "-ojo krovinio svori: ");
                    int weight = sc.nextInt();
                    if ((i + 1) < destination) {
                        maxLoad += weight;
                    } else {
                        maxLoad -= weight;
                    }
                }
            }
            System.out.println(maxLoad);
            sc.close();
    }
}
