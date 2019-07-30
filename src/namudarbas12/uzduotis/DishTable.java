package namudarbas12.uzduotis;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class DishTable extends JTable {


    public DishTable(TableModel dm ) {
        super(dm);
    }


    public static JTable getTable(Recipes recipeBook) {
        DefaultTableModel dishTableModel = new DefaultTableModel();
        dishTableModel.addColumn("Patiekalai");
        for (int i = 0; i < recipeBook.recipes.length; i++) {
            String rowString = recipeBook.recipes[i].name;
            dishTableModel.addRow(new Object[]{rowString});
        }

        return new DishTable(dishTableModel);

    }


    public static void setProductsTable(JTable table, Recipes recipeBook, int dishIndex) {
        DefaultTableModel productTableModel = (DefaultTableModel) table.getModel();
        for (int i = 0; i < recipeBook.recipes[dishIndex].products.length; i++) {
            String[] data = new String[5];
            data[0] = recipeBook.recipes[dishIndex].products[i].name;
            data[1] = Integer.toString(recipeBook.recipes[dishIndex].products[i].fats);
            data[2] = Integer.toString(recipeBook.recipes[dishIndex].products[i].proteins);
            data[3] = Integer.toString(recipeBook.recipes[dishIndex].products[i].carbs);
            data[4] = Integer.toString(recipeBook.recipes[dishIndex].products[i].amount);

            productTableModel.addRow(data);
        }
        table.setModel(productTableModel);
    }

    }






