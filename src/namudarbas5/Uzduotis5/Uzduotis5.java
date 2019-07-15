package namudarbas5.Uzduotis5;

import java.util.Scanner;

public class Uzduotis5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaičių kiekį: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
       String primeNums = " ";
       String nonPrimeNums = " ";

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Įveskite skaičių: ");
            nums[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < nums.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= nums[i] / 2; j++) {
                if (nums[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNums += nums[i] + " ";
            } else {
                nonPrimeNums += nums[i] + " ";
            }
        }
        System.out.println("Pirminiai skaičiai: " + primeNums);
        System.out.println("Sudėtiniai skaičiai: " + nonPrimeNums);
    }
}

