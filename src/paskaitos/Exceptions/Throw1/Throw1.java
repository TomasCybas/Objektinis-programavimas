package paskaitos.Exceptions.Throw1;

import java.util.Scanner;

public class Throw1 {

    public static int power(int x, int n){
        int tmp = 1;
        for(int i = 0; i < n; i++){
            tmp+= x;
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("iveskite skaiciu: ");
        int x = sc.nextInt();
        System.out.println("iveskite lapsni: ");
        int n = sc.nextInt();

        System.out.println("pakelta " + power(x, n));

    }
}
