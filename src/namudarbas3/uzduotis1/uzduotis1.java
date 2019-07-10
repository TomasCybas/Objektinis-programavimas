package namudarbas3.uzduotis1;

import java.util.Scanner;

public class uzduotis1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Įveskite pirmą natūralųjį skaičių: ");
        int m = sc.nextInt();
        System.out.print("Įveskite antrą natūralųjį skaičių: ");
        int n = sc.nextInt();
        sc.close();

        int i = 0;
         while( i < m *n ){
             i++;
             if (i % m == 0 && i % n == 0){
                 System.out.println("Mažiausias bendras kartotinis: " + i);
                 return;
             }
         }
    }
}
