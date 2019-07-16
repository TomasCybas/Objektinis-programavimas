package paskaitos.Exceptions.Try1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Try1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("path"));
            int x = sc.nextInt();
            int y = sc.nextInt();
            int result = x/y;
            System.out.println("Atsakymas: " + result);

        }catch (FileNotFoundException e){
            System.out.println("Failas nerastas");
        }catch (ArithmeticException e) {
            System.out.println("Dalyba is siu skaiciu negalima");
        }catch (InputMismatchException e){
            System.out.println("Neteisingai ivesti skaiciai");
        }catch (Exception e){
            System.out.println("Ivyko nenumatyta klaida");
        }

    }
}
