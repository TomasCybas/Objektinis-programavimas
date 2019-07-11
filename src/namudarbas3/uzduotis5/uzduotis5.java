package namudarbas3.uzduotis5;

import java.util.Scanner;

public class uzduotis5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Įveskite skritulių kiekį: ");
        int n = sc.nextInt();
        System.out.print("Įveskite pirmojo skritulio spindulį: ");
        int r = sc.nextInt();
        sc.close();
        double area = 0;

        for (int i = 0; i < n; i++){
            if (i > 0){
                r += r*2;
            }
            area += Math.PI * Math.pow(r, 2);
        }
        System.out.println(area);
    }
}
