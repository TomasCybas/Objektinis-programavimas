package namudarbas3.uzduotis3;

import java.util.Scanner;

public class uzduotis3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Įveskite pradinį atlyginimą eurais: ");
        int startSalary = sc.nextInt();
        System.out.println("Įveskite sumą, kuria atlyginimas didės kas mėnesį: ");
        int growthPerMonth = sc.nextInt();
        System.out.println("Įveskite mėnesių skaičių: ");
        int months = sc.nextInt();
        System.out.println("Įveskite norimą atlgyinimą laikotarpio pabaigoje: ");
        int endSalary = sc.nextInt();
        sc.close();

        System.out.println("Po metų alyginimas bus: " + (startSalary + (growthPerMonth *12)) );


        boolean isdoubled = false;
        int i = 1;
        int salary = startSalary;
        while (salary <= endSalary ){
            i ++;
            salary += growthPerMonth;
            if ( i == months) {
                System.out.println("Po " + i + "mėnesių atlyginimas bus " + salary);
            }

            if( salary == endSalary){
                System.out.println("Norimas altyginimas bus pasiektas po " + i + "mėnesių");
            }
            if(salary > startSalary * 2 && !isdoubled){
                System.out.println("Atlgynimas dvigubai padidės po " + i + "mėnesių");
                isdoubled = true;

            }
        }
    }
}
