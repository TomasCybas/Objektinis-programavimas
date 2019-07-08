package paskaitos;

import java.util.Scanner;

public class vykdymas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite amziu ");


        int age = sc.nextInt();
        sc.close();

        /*if( age <= 1){
            System.out.println("Grupe: kudikis");
        }else {
            System.out.println("Grupe: vaikas");
        }*/

        String output = (age <= 1)?"Grupe: kudikis" : "Grupe: vaikas";
        System.out.println(output);

    }
}
