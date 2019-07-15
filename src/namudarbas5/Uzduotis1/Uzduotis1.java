package namudarbas5.Uzduotis1;

import java.util.Scanner;


public class Uzduotis1 {

    public static int getMaxCircle( int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int getNumOfMaxCircles(int max, int[] arr){
        int numOfMax = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == max){
                numOfMax++;
            }
        }
        return numOfMax;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite apskritmų kiekį: ");
        int n = sc.nextInt();
        int[] circles = new int [n];
        for (int i = 0; i < circles.length; i++){
            System.out.println("Iveskite " + (i+1) + "-ojo apskritimo spindulį: ");
            circles[i] = sc.nextInt();
        }
        sc.close();
        double maxCircle = Math.PI * Math.pow(getMaxCircle(circles), 2 );
        System.out.println("Didžiausias apskritimas lygus " + maxCircle);
        System.out.println("Tokių apskritimų yra: " + getNumOfMaxCircles(getMaxCircle(circles), circles));
    }
}
