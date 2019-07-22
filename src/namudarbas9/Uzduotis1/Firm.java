package namudarbas9.Uzduotis1;

public class Firm {
    public static void main(String[] args) {

        Staff personnel = new Staff(6);
        Employee jonaitis = new Employee("Jonas", "Jonaitis", "123", "4568", 200);
        Employee petraitis = new Employee("Petras", "Petraitis", "123", "8745", 300);
        Trainee pavardenis = new Trainee("Vardenis", "Pavardenis", "321");
        Executive vardenis = new Executive("Pavardenis", "Vardenis", "123", "46512", 300);
        Hourly ramanauskas = new Hourly("Algis", "Ramanauskas", "321", "458", 3.6);
        Hourly bebrauskas = new Hourly("Stepas", "Bebrauskas", "123", "8745", 2.6);


        personnel.addStaffMember(jonaitis);
        personnel.addStaffMember(petraitis);
        personnel.addStaffMember(pavardenis);
        personnel.addStaffMember(vardenis);
        personnel.addStaffMember(ramanauskas);
        personnel.addStaffMember(bebrauskas);
        bebrauskas.addHours(10);
        ramanauskas.addHours(20);
        vardenis.awardBonus(150);
        System.out.println("Iš viso išmokėti: " + personnel.payDay());

    }

}
