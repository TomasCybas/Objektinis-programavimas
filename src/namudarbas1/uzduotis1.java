package namudarbas1;

import java.util.Scanner;

public class uzduotis1 {
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.println("Įveskite kambario ilgį metrais: ");
       int ilgis = in.nextInt();
       System.out.println("Įveskite kamabrio plotį metrais: ");
       int plotis = in.nextInt();
       System.out.println("Įveskite plytelių kv. metro kainą eurais: ");
       double kaina = in.nextDouble();
       in.close();
       int plotas = plotis * ilgis;
       double atsarga = 1.05;
       double suma = plotas * atsarga * kaina;


       System.out.println("Plytelės kainuos: " + suma + " €");
   }

}
