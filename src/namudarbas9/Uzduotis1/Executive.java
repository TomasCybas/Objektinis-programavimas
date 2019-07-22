package namudarbas9.Uzduotis1;

import namudarbas9.Uzduotis1.Employee;

public class Executive extends Employee {
    protected double bonus = 0;
    public Executive(String name, String surname, String phone, String socSecNo, double salary) {
        super(name, surname, phone, socSecNo, salary);
    }

    public double awardBonus( double bonus){
        return this.bonus += bonus;
    }

    @Override
    public double pay() {
        return super.pay() + this.bonus;
    }
}
