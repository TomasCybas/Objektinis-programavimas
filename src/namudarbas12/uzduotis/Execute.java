package namudarbas12.uzduotis;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

public class Execute {

    public static void main(String[] args) {




     Dish pizza = new Dish("pica");
     pizza.addProduct("suris", 14, 13, 12, 3);
     pizza.addProduct("kazkas", 25, 13, 31, 3);
     pizza.addProduct("Kazkas Kitas", 58, 99, 12, 3);
     pizza.addProduct("belekas", 14, 454, 12, 3);
     Dish test = new Dish("testas");
     test.addProduct("kazkas", 11, 15, 132 ,123 );
     test.addProduct("kazkas kitas", 11, 15, 132 ,123 );
     test.addProduct("kazkas dar kitas", 11, 15, 132 ,123 );
     test.addProduct("ir dar kazkas", 11, 15, 132 ,123 );

     Recipes recipeBook = new Recipes();
     recipeBook.addRecipe(pizza);
     recipeBook.addRecipe(test);






     JFrame frame = new JFrame("Patiekalai");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel main = new JPanel(new GridLayout(2, 1));
        frame.add(main);

        JTable dishesTable = DishTable.getTable(recipeBook);
        JScrollPane scroll = new JScrollPane(dishesTable);
        main.add(scroll);
        dishesTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selected = dishesTable.getSelectedRow();
                System.out.println(selected);
                JTable productsTable = DishTable.getProductsTable(recipeBook, selected);
                JScrollPane scroll2 = new JScrollPane(productsTable);
                main.remove(scroll2);
                main.add(scroll2);
                main.remove(productsTable);
                main.add(productsTable);
            }


        });
        

        frame.setSize(700, 600);
        frame.setVisible(true);










    }
}
