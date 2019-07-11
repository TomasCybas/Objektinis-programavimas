package namudarbas3.uzduotis6;

import java.util.Scanner;

public class uzduotis6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaicius (pabaiga 0): ");
        int i = sc.nextInt();
        int sum = 0;
        int nums = 0;
        while (i != 0) {
            sum += i;
            nums++;
            i = sc.nextInt();
        }
        System.out.println("Skaiciu suma: " + sum);
        System.out.println("Skaiciu vidurkis: " + sum / (double) nums);
    }
}
