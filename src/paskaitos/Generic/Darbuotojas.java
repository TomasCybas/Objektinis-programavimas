package paskaitos.Generic;

public class Darbuotojas implements ID {
    public String name;
    public String surname;


    public Darbuotojas(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int getId() {
        return 0;
    }
}
