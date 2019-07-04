package namudarbas1;

import java.util.Scanner;

public class uzduotis3 {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        System.out.println("Įveskite taško coordinatę x1:");
        int x1 = in.nextInt();
        System.out.println("Įveskite taško coordinatę y1:");
        int y1 = in.nextInt();
        System.out.println("Įveskite taško coordinatę x2:");
        int x2 = in.nextInt();
        System.out.println("Įveskite taško coordinatę y2:");
        int y2 = in.nextInt();
        in.close();
        int a = Math.abs(x2 - x1);
        int b = Math.abs(y2 - y1);
        int area = a * b;
        int perimeter = 2*(a + b);
        System.out.println("Stačiakampio plotas: " + area + "\nStačiakampio perimetras: " + perimeter);
    }
}
