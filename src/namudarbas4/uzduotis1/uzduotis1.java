package namudarbas4.uzduotis1;

import java.util.Scanner;

public class uzduotis1 {
    public static int calculateArea(int a, int b){
        return a * b ;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Įveskite kraštinės a ilgį: ");
        int a = sc.nextInt();
        System.out.print("Įveskite kraštinės b ilgį: ");
        int b = sc.nextInt();
        sc.close();
        System.out.println("Stačiakampio plotas: " + calculateArea(a, b));

    }
}
