package paskaitos.Exceptions.uzduotis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class uzduotis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner filesc = null;
        int attempts = 0;

        while (filesc == null) {
            System.out.println("Iveskite failo pavadinima: ");
            String file = sc.next();

            try{
                filesc = new Scanner(new File(file));

            }catch (FileNotFoundException e) {
                System.out.println("Failas nerastas");
                attempts++;
                if (attempts == 3){
                    System.exit(1);
                }
            }
        }

        while(filesc.hasNext()){
            System.out.println(filesc.nextLine());
        }
        filesc.close();
    }
}
