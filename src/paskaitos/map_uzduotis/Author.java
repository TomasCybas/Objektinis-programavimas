package paskaitos.map_uzduotis;

import java.util.ArrayList;
import java.util.Objects;

public class Author {
    public String name;
    public String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int hashCode() {
        return this.surname.hashCode();
    }

    @Override
    public boolean equals(Object o) {
       return this.surname.equals(((Author)o).surname);
    }

    @Override
    public String toString() {
        return  name + " " + surname;
    }
}
