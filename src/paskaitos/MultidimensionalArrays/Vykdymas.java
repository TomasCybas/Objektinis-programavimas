package paskaitos.MultidimensionalArrays;

import java.util.Scanner;

public class Vykdymas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [][] arr = new int [5][5];
        for(int i = 0; i < 5; i++){
            for (int y = 0; y < 5; y++){
                arr[i][y] = sc.nextInt();
            }
        }
        int sum = 0;
        int [] sumos = new int[5];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                sumos[i] += arr[i][j];
            }
        }
        for(int i = 0; i < 5; i++){
            System.out.println(sumos[i]);
        }
    }
}
