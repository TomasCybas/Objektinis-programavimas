package namudarbas3.uzduotis2;

import java.util.Scanner;

public class uzduotis2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Įveskite pirmą natūralųjį skaičių: ");
        int m = sc.nextInt();
        System.out.print("Įveskite antrą natūralųjį skaičių: ");
        int n = sc.nextInt();
        sc.close();

        for( int i = 1; i <= m && i <= n; i++ ){
            if(m % i == 0 && n % i == 0){
                System.out.println("Didžiausias bendras daliklis: " + i);
            }
        }
    }
}
