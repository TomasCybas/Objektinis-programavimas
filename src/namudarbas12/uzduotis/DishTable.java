package namudarbas12.uzduotis;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class DishTable extends JTable {
    public   Object [][] rowData = {};
    public   Object [] columnNames = {};

    public DishTable(TableModel dm, Object[][] rowData, Object [] columnNames) {
        super(dm);
        this.rowData = rowData;
    }

    public DishTable(Recipes recipeBook){
     /*   columnNames = new Object[]{"Patiekalas"};
        DefaultTableModel dishTableModel = new DefaultTableModel(rowData, columnNames);
        for (int i = 0; i < recipeBook.recipes.length; i++) {
            String rowString = recipeBook.recipes[i].name;
            dishTableModel.addRow(new Object[] {rowString});
        }

        JTable dishTable = new JTable(dishTableModel);
     */
    }

    public static JTable getTable(Recipes recipeBook){
        Object [] columnNames = new Object[]{"Patiekalas"};
        Object [][] rowData=new Object[0][0];
        DefaultTableModel dishTableModel = new DefaultTableModel();
        dishTableModel.addColumn("Patiekalai");
        for (int i = 0; i < recipeBook.recipes.length; i++) {
            String rowString = recipeBook.recipes[i].name;
            dishTableModel.addRow(new Object[] {rowString});
        }

        return  new DishTable(dishTableModel, rowData, columnNames);

    }

    public static getProductsTable(Recipes recipeBook){
        Object [] columnNames = new Object[]{"Patiekalas"};
        Object [][] rowData=new Object[0][0];
        DefaultTableModel productTableModel = new DefaultTableModel();
        productTableModel.addColumn("Pavadinimas");
        productTableModel.addColumn("Riebalai");
        productTableModel.addColumn("Baltymai");
        productTableModel.addColumn("Angliavandeniai");
        productTableModel.addColumn("Kiekis");
        for(int i = 0; i < )
        return new DishTable(productTableModel, columnNames, rowData);
    }


}
