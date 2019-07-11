package paskaitos.arrays.vykdymas1;

import java.util.Scanner;

public class vykdymas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaicius nuo 0 iki 9, pabaiga: -1");
        int tmp = sc.nextInt();
        int [] nums = new int[10];
        while (tmp != -1){
            nums[tmp]++;
            tmp = sc.nextInt();
        }
       sc.close();
        for (int i = 0; i < nums.length -1; i++){
            for (int y = i+1; y < nums.length; y++){
                if(nums[i] > nums[y]){
                    int t = nums[y];
                    nums[y] = nums[i];
                    nums[i]= t;
                }
            }
        }
        for (int i = 0; i < nums.length; i++){
            System.out.println(i + "-" + nums[i]);
        }
    }
}
