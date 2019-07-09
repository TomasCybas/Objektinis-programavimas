package namudarbas2.uzduotis6;

import java.util.Scanner;

public class uzduotis6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Įveskite metus: ");
        int year = sc.nextInt();
        sc.close();

        if((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " metai - keliamieji");
        } else {
            System.out.println(year + " metai - ne keliamieji");
        }
    }
}
