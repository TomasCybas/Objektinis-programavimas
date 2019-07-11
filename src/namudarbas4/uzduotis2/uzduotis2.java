package namudarbas4.uzduotis2;

import java.time.LocalDate;
import java.util.Scanner;
import static java.time.temporal.ChronoUnit.DAYS;


public class uzduotis2 {
    public static long betweenDates(LocalDate firstDate, LocalDate secondDate){
        return DAYS.between(firstDate, secondDate);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Įveskite pirmą datą: yyyy-mm-dd ");
        LocalDate firstDate = LocalDate.parse(sc.nextLine());
        System.out.println("Įveskite antrą datą: yyyy-mm-dd ");
        LocalDate secondDate = LocalDate.parse(sc.nextLine());
        sc.close();

        System.out.println(betweenDates(firstDate, secondDate));
    }
}
