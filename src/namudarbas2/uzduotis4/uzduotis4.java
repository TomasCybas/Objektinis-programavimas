package namudarbas2.uzduotis4;

import java.util.Scanner;

public class uzduotis4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Įveskite triženklį skaičių: ");
        int number = sc.nextInt();
        sc.close();

        if(100 > number || number > 999){
            System.out.println("Skaičius ne triženklis");
        }
        int thirdDigit = (number % 100) % 10;
        int secondDigit = (number / 10) % 10;
        int firstDigit = number / 100;
        if (Math.pow(firstDigit ,3) + Math.pow(secondDigit, 3) + Math.pow(thirdDigit, 3) == number){
            System.out.println("Skaičius - Armstrongo");
        } else {
            System.out.println("Skaičius - ne Armstrongo");
        }
    }
}
