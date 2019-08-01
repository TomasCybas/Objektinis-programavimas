package paskaitos.map_uzduotis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Execute {
    public static void main(String[] args) {

        Map <Author, List<Book>> bookMap = new HashMap<>();

        bookMap.put(new Author("Autorius1", "Autorius1"), new ArrayList<>());
        bookMap.put(new Author ("Autorius2", "Autorius2"), new ArrayList<>());

        bookMap.get(new Author("Autorius1", "Autorius1")).add(new Book("book1", 345));
        bookMap.get(new Author("Autorius1", "Autorius1")).add(new Book("book2", 543));

        for (Author auth : bookMap.keySet()){
            List<Book> books = bookMap.get(auth);
            System.out.println(auth + " knygos: " + books);
        }


    }
}
