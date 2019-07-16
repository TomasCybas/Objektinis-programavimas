package namudarbas6.uzduotis1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Uzduotis1 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("data\\uzduotis1\\uzduotis1.txt"));
        int weeks = sc.nextInt();
        int[][] temperatures = new int[weeks][7];
        for (int i = 0; i < weeks; i++) {
            for (int j = 0; j < 7; j++) {
                temperatures[i][j] = sc.nextInt();
            }
        }

        int [] averages = new int[weeks];
        for (int i = 0; i < weeks; i++) {
            for (int j = 0; j < 7; j++) {
                averages [i] += temperatures[i][j];
            }
            averages [i] = averages[i]/7;
        }
        for (int i = 0; i < averages.length; i++){
            System.out.println(i+1 + " savaitės temperatūra: " + averages[i]);
        }

    }
}
