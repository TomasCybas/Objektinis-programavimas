package namudarbas2.uzduotis3;

import java.util.Scanner;

public class uzduotis3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Įveskite valandas: ");
        int hours = sc.nextInt();
        System.out.print("Įveskite minutes: ");
        int minutes = sc.nextInt();
        System.out.print("Įveskite sekundes: ");
        int seconds = sc.nextInt();
        sc.close();

        seconds++;
        if(seconds == 60){
            seconds = 0;
            minutes++;
            if(minutes == 60){
                minutes = 0;
                hours++;
                String time = ((hours < 10 ? "0" : "") + hours)+ ":" + ((minutes < 10 ? "0" : "") + minutes) + ":" +
                        ((seconds < 10 ? "0" : "") + seconds);
                System.out.println("Laikas po sekundės: " + time);
            }
        }else {
            String time = ((hours < 10 ? "0" : "") + hours)+ ":" + ((minutes < 10 ? "0" : "") + minutes) + ":" +
                    ((seconds < 10 ? "0" : "") + seconds);
            System.out.println("Laikas po sekundės: " + time);
        }
    }
}
