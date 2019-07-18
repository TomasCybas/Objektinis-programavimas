package namudarbas5.Papildoma;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Papildoma {
    public static void main(String[] args) throws FileNotFoundException {
            Scanner sc = new Scanner(new File("data/namudarbas5/data.txt"));

            int n = sc.nextInt();
            int[] warehouses = new int[n];
            int maxLoad = 0;
            for (int i = 0; i < warehouses.length; i++) {
                // ivedamas kroviniu kiekis iš sandelio:
                int loads = sc.nextInt();
                for (int j = 1; j <= loads; j++) {
                    //ivedamas destination
                    int destination = sc.nextInt();
                    //ivedamas svoris
                    int weight = sc.nextInt();
                        maxLoad += weight;
                        if ((i + 1) < destination) {
                    } else {
                        maxLoad -= weight;
                    }
                }
            }
            System.out.println(maxLoad);
            sc.close();
    }
}
