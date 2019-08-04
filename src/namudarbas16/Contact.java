package namudarbas16;

import java.util.ArrayList;
import java.util.Objects;

public class Contact {
    private String surname;

    public Contact(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
            return this.surname.equals(((Contact)o).surname);
    }

    @Override
    public int hashCode() {
        return this.surname.hashCode();
    }

    @Override
    public String toString() {
        return this.surname;
    }
}
