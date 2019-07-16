package namudarbas6.uzduotis2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class uzduotis2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data/namudarbas6/uzduotis2/uzduotis2.txt"));
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i == arr.length - 1) {
                for (int j = 0; j < arr.length; j++) {
                    if (j == 0 || j == arr.length - 1) {
                        arr[i][j] = 0;
                    }
                }
            }
            System.out.println();
        }
        for (int[] x : arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }


    }
}


