package namudarbas2.uzduotis2;

import java.util.Scanner;

public class uzduotis2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Įveskite metus: ");
        int year = sc.nextInt();
        sc.close();

        int beginningYear = 1896;

        if( (year - beginningYear) % 4 == 0){
            int gamesNo = (year - beginningYear) / 4;
            gamesNo++;
            System.out.println(year + " metais vyko " + gamesNo + "-osios Olimpinės žaidynės");
        } else {
            System.out.println(year + " metai - ne Olimpiniai");
        }
    }
}
