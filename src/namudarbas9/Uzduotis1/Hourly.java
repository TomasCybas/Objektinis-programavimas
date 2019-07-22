package namudarbas9.Uzduotis1;

import namudarbas9.Uzduotis1.Employee;

public class Hourly extends Employee {
    protected int hoursWorked = 0;

    public Hourly(String name, String surname, String phone, String socSecNo, double salary) {
        super(name, surname, phone, socSecNo, salary);
    }

    public int addHours(int hours){
        return this.hoursWorked += hours;
    }

    @Override
    public double pay() {
        double sum = this.salary * this.hoursWorked;
        this.hoursWorked = 0;
        return  sum;

    }
}

