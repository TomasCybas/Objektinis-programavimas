package namudarbas12.uzduotis;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class DishTable extends JTable {
    public Object[][] rowData = {};
    public Object[] columnNames = {};

    public DishTable(TableModel dm, Object[][] rowData, Object[] columnNames) {
        super(dm);
        this.rowData = rowData;
    }

    public DishTable() {

    }

    public static JTable getTable(Recipes recipeBook) {
        Object[] columnNames = new Object[]{};
        Object[][] rowData = new Object[0][0];
        DefaultTableModel dishTableModel = new DefaultTableModel(rowData, columnNames);
        dishTableModel.addColumn("Patiekalai");
        for (int i = 0; i < recipeBook.recipes.length; i++) {
            String rowString = recipeBook.recipes[i].name;
            dishTableModel.addRow(new Object[]{rowString});
        }

        return new DishTable(dishTableModel, rowData, columnNames);

    }


    public static JTable getProductsTable(Recipes recipeBook, int dishIndex) {
        Object[] columnNames = new Object[]{};
        Object[][] rowData = new Object[0][0];
        DefaultTableModel productTableModel = new DefaultTableModel(rowData, columnNames);
        productTableModel.addColumn("Produktas");
        productTableModel.addColumn("Riebalai");
        productTableModel.addColumn("Baltymai");
        productTableModel.addColumn("Angliavandeniai");
        productTableModel.addColumn("Kiekis");
        for (int i = 0; i < recipeBook.recipes[dishIndex].products.length; i++) {
            String[] data = new String[5];
            data[0] = recipeBook.recipes[dishIndex].products[i].name;
            data[1] = Integer.toString(recipeBook.recipes[dishIndex].products[i].fats);
            data[2] = Integer.toString(recipeBook.recipes[dishIndex].products[i].proteins);
            data[3] = Integer.toString(recipeBook.recipes[dishIndex].products[i].carbs);
            data[4] = Integer.toString(recipeBook.recipes[dishIndex].products[i].amount);

            productTableModel.addRow(data);
        }
        return new DishTable(productTableModel, rowData, columnNames);

    }





}
