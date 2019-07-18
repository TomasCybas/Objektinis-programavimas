package paskaitos.paveldimumas.uzduotis1;

public class Employee {
    public Employee() {
    }

    protected String name;
    protected String surname;
    protected Integer workingHours;
    protected Double rate;

    public Employee(String name, String surname, Integer workingHours, Double rate) {
        this.name = name;
        this.surname = surname;
        this.workingHours = workingHours;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Integer workingHours) {
        this.workingHours = workingHours;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", workingHours=" + workingHours +
                ", rate=" + rate +
                '}';
    }

    public double getSalary(){
        return this.workingHours * this.rate;
    }
}
