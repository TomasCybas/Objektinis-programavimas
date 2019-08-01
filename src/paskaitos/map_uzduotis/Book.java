package paskaitos.map_uzduotis;

public class Book {
    public String name;
    public Integer pages;

    public Book(String name, Integer pages) {
        this.name = name;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return name;
    }
}
