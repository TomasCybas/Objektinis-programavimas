package namudarbas5.uzduotis2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Uzduotis2 {
        public static int getMaxGrade( int[] arr){
            int maxGrade = arr[0];
            int bestStudent = 0;
            for (int i = 0; i < arr.length; i++){
                if(arr[i] > maxGrade){
                    maxGrade = arr[i];
                    bestStudent = i;
                }
            }
            return bestStudent;
        }

        public static int getMinGrade( int [] arr){
            int minGrade = arr[0];
            int worstStudent = 0;
            for (int i = 0; i < arr.length; i++){
                if(arr[i] < minGrade){
                    minGrade = arr[i];
                    worstStudent = i;
                }
            }
            return worstStudent;
        }

        public static double getClassAvg (int [] arr, int n){
            double sum = 0;
            for (int i = 0; i < arr.length; i++){
                sum+= arr[i];
            }
            return sum/n;
        }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite mokinių skaičių: ");
        int n = sc.nextInt();
        int [] students = new int[n];
        for (int i = 0; i < students.length; i++){
            System.out.println("Iveskite " + (i+1) + "-ojo mokinio pažymį : ");
            students[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(" Geriausiai besimokantis mokinys: " + getMaxGrade(students));
        System.out.println("Blogiausiai besimokamntis mokinys: " + getMinGrade(students));
        System.out.println("Klasės vidurkis: " + getClassAvg(students, n));
    }
}
