package namudarbas12.uzduotis;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Arrays;

public class Execute {

    public static void main(String[] args) {

        Dish pizza = new Dish("pica");
        pizza.addProduct("suris", 14, 13, 12, 3);
        pizza.addProduct("kazkas", 25, 13, 31, 3);
        pizza.addProduct("Kazkas Kitas", 58, 99, 12, 3);
        pizza.addProduct("belekas", 14, 454, 12, 3);
        System.out.println(Arrays.toString(pizza.products));



       JFrame frame = new JFrame("Patiekalai");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel main = new JPanel(new GridLayout(2, 1));
        frame.add(main);

        DefaultTableModel dishesModel = new DefaultTableModel();
        JTable dishesTable = new JTable();






        frame.setSize(700, 600);
        frame.setVisible(true);
    }
}
