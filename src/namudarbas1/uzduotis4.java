package namudarbas1;

import java.util.Scanner;

public class uzduotis4 {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        System.out.println("Įveskite pradžios laiką.\n Valanda: ");
        int h1 = in.nextInt();
        System.out.println("Minutės: ");
        int m1 = in.nextInt();
        System.out.println("Įveskite pabaigos laiką.\n Valanda: ");
        int h2 = in.nextInt();
        System.out.println("Minutės: ");
        int m2 = in.nextInt();
        in.close();

        int startTimeInMinutes = (h1 * 60 ) + m1;
        int endTimeInMinutes = (h2 *60) + m2;
        int timeSpent = (endTimeInMinutes - startTimeInMinutes);
        System.out.println("Praleistas laikas: " + timeSpent/60 + "h " + timeSpent % 60 + "min" );
    }
}
