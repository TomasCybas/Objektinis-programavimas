package namudarbas9.Uzduotis1;

public class Employee extends StaffMember {
    protected String socSecNo;
    protected double salary;


    public Employee(String name, String surname, String phone, String socSecNo, double salary) {
        super(name, surname, phone);
        this.socSecNo = socSecNo;
        this.salary = salary;
    }

    @Override
    public double pay() {
        return this.salary;
    }
}
