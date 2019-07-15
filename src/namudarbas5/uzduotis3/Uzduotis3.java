package namudarbas5.uzduotis3;

import java.util.Scanner;

public class Uzduotis3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaičių kiekį: ");
        int n = sc.nextInt();
        int [] nums = new int [n];
        for (int i = 0; i < nums.length; i++){
            System.out.println("Iveskite skaičių: ");
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < nums.length -1; i++){
            for (int y = i+1; y < nums.length; y++){
                if(nums[i] < nums[y]){
                    int t = nums[y];
                    nums[y] = nums[i];
                    nums[i] = t;
                }
            }
        }
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

    }
}
