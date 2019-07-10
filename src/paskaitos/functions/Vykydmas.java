package paskaitos.functions;

import java.util.Scanner;

public class Vykydmas {

    /**
     * Function to calculate area of a circle
     * @param r - is the ray of a circle
     * @return calculates area of circle
     */
    public static double circleArea( double r){
        return Math.PI * Math.pow(r, 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite aspkritmo spinduli: ");
        double r = sc.nextDouble();
        sc.close();

        System.out.println("Apskritimo plotas = " + circleArea(r));


    }
}
