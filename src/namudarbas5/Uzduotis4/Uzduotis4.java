package namudarbas5.Uzduotis4;

import java.util.Scanner;

public class Uzduotis4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite namu skaiciu: ");
        int n = sc.nextInt();
        int[] houses = new int[n];
        for (int i = 0; i < houses.length; i++) {
            System.out.print("Iveskite gyventoju skaiciu " + (i+1) + "-ajame name: ");
            houses[i] = sc.nextInt();
        }
        sc.close();
        int sum = 0;
        int leftSum = 0;
        int rightSum = 0;
        int leftHouses = 0;
        int rightHouses = 0;
        for (int i = 0; i < houses.length; i++) {
            sum += houses[i];
            if ((i + 1) % 2 == 0) {
                rightSum += houses[i];
                rightHouses++;
            } else {
                leftSum += houses[i];
                leftHouses++;
            }
        }
        System.out.println("Iš viso gatvėje gyvena: " + sum + " gyventojų");
        System.out.println("Kairėje pusėje iš viso gyvena: " + leftSum + " gyventojų. \n" +
                "Vidutiniškai viename name: " + leftSum / leftHouses + " gyventojų");
        System.out.println("Dešinėje pusėje iš viso gyvena: " + rightSum + " gyventojų. \n" +
                "Vidutiniškai viename name: " + rightSum / rightHouses + " gyventojų");

    }
}
