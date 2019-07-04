package namudarbas1;

import java.util.Scanner;

public class uzduotis5 {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        System.out.println("Įveskite kraštinės a ilgį:");
        double a = in.nextInt();
        System.out.println("Įveskite kraštinės b ilgį:");
        double b = in.nextInt();
        System.out.println("Įveskite kraštinės c ilgį:");
        double c = in.nextInt();
        in.close();
        double p = ((a + b + c) / 2);
        if(! (a + b > c && a + c > b && b + c > a )) {
            System.out.println("Trikampis negalimas");
        } else {
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Trikampio plotas: " + area);
        }

    }
}



