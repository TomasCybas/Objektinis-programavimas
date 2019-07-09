package namudarbas2.uzduotis1;

import java.util.Scanner;

public class uzduotis1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Įveskite kraštinės a ilgį: ");
        int a = sc.nextInt();
        System.out.print("Įveskite kraštinės b ilgį: ");
        int b = sc.nextInt();
        System.out.print("Įveskite kraštinės c ilgį: ");
        int c = sc.nextInt();
        System.out.print("Įveskite kraštinės d ilgį: ");
        int d = sc.nextInt();
        sc.close();

        if((a == b && c == d) || (a == c && b == d) || (a == d && c == b)){
            System.out.println("Galima sudaryti stačiakampį");
        } else {
            System.out.println("Stačiakampo sudaryti negalima");
        }
    }
}
