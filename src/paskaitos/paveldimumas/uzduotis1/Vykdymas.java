package paskaitos.paveldimumas.uzduotis1;

import paskaitos.paveldimumas.uzduotis1.Employee;
import paskaitos.paveldimumas.uzduotis1.Manager;

public class Vykdymas {
    public static void main(String[] args) {

        Employee jonas = new Employee("Jonas", "Jonaitis", 14, 6.4);
        Manager petras = new Manager("Petras", "Petraitis", 14, 6.4, 7);


        System.out.println(petras.getSalary());
        System.out.println(jonas.getSalary());


    }
}
