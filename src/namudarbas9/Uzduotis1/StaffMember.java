package namudarbas9.Uzduotis1;

public class StaffMember {
    protected String name;
    protected String surname;
    protected String phone;

    public StaffMember(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "StaffMember{" +
                "name: " + this.name + '\'' +
                ", Surname '" + this.surname + '\'' +
                ", Phone '" + this.phone + '\'' +
                '}';
    }

    public double pay(){
        return 0;
    }
}
