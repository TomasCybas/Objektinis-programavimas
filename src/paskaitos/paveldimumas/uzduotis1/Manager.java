package paskaitos.paveldimumas.uzduotis1;

import paskaitos.paveldimumas.uzduotis1.Employee;

public class Manager extends Employee {
    Integer employeeCount;

    public Integer getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(Integer employeeCount) {
        this.employeeCount = employeeCount;
    }

    public Manager(String name, String surname, Integer workingHours, Double rate, Integer employeeCount) {
        super(name, surname, workingHours, rate);
        this.employeeCount = employeeCount;
    }

    public double getSalary(){
        return super.getSalary() + this.employeeCount * this.workingHours;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "employeeCount=" + employeeCount +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", workingHours=" + workingHours +
                ", rate=" + rate +
                '}';
    }
}
