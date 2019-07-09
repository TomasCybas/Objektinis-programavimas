package namudarbas2.uzduotis5;

import java.util.Scanner;

public class uzduotis5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Įveskite skaičių a: ");
        int a = sc.nextInt();
        System.out.print("Įveskite skaičių b: ");
        int b = sc.nextInt();
        System.out.print("Įvesktie skaičių c: ");
        int c = sc.nextInt();
        sc.close();

        double d = Math.pow(b, 2) - 4 * a * c;


        if(d >= 0) {
            double x1 = (-b + Math.sqrt(d))/ 2 * a;
            double x2 = (-b - Math.sqrt(d)) / 2 * a;
            if(x1 == x2){
                System.out.println("x = " + x1);
            } else {
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        } else {
            System.out.println("Lygtis realiųjų sprendinių neturi");
        }
    }
}
