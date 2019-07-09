package namudarbas2.uzduotis7;

import java.util.Scanner;

public class uzduotis7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Įveskite metus: ");
        int year = sc.nextInt();
        sc.close();
        int beginningYear = 1984;

        int cycleYear = (year - beginningYear) % 60;
        if(cycleYear >= 0){
            cycleYear++;
        } else {
            cycleYear = Math.abs(year-beginningYear + 60) % 60;
        }
        int yearColorNo = cycleYear % 10;
        System.out.println(yearColorNo);
        System.out.println(cycleYear);

        switch (yearColorNo) {
            case 1:
            case 2:
                System.out.println("Žalia");
                break;
            case 3:
            case 4:
                System.out.println("Raudona");
                break;
            case 5:
            case 6:
                System.out.println("Geltona");
                break;
            case 7:
            case 8:
                System.out.println("Balta");
                break;
            case 9:
            case 0:
                System.out.println("Juoda");
                break;
            default:
                System.out.println("Neteisingai įvesti metai");
        }
    }
}
