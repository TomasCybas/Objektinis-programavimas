package paskaitos.functions;


import java.util.Scanner;

public class vykdymas2 {
    public static double round ( double x){
        return round(x,2);
    }
    public static double round ( double x, double y){
        double d = Math.pow(10, y);
        return Math.round(x*d)/d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite norima suapvalinti skaiciu: ");
        double x = sc.nextDouble();
        System.out.println("Iveskite desimtaja dali iki kurios norite suapvalinti: ");
        double y = sc.nextInt();
        sc.close();

        System.out.println(round(x, y));
        System.out.println(round(x));
    }
}
