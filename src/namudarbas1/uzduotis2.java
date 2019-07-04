package namudarbas1;

import java.util.Scanner;

public class uzduotis2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Įveskite per mėnesį vidutiniškai persskaitytų knygų kiekį: ");
        double booksPerMonth = in.nextDouble();
        System.out.println("Įveskite vidutiniškai per metus apsilankiusių kiekį: ");
        double readersPerYear = in.nextDouble();
        in.close();

        double booksPerReaderPerYear = Math.round((booksPerMonth *12) / readersPerYear);
        System.out.println("Vidutiškai per metus vienas lankytojas perskaito " + booksPerReaderPerYear + " knygas");
    }
}