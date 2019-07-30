package namudarbas11;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Execute {
    static Employee employee = new Employee();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Kontaktai");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Begin components
        JPanel panel = new JPanel();
        JButton load = new JButton("Atidaryti");
        JButton save = new JButton("Išsaugoti");
        frame.add(panel);
        JPanel mainPanel = new JPanel(new GridLayout(6, 2));
        panel.add(mainPanel);
        JTextField name = new JTextField(20);
        JTextField surname = new JTextField(20);
        JTextField phoneNumber = new JTextField(20);
        JTextField email = new JTextField(20);
        JTextField comment = new JTextField(20);
        mainPanel.add(new Label("Vardas"));
        mainPanel.add(name);
        mainPanel.add(new Label("Pavarde"));
        mainPanel.add(surname);
        mainPanel.add(new Label("Telefonas"));
        mainPanel.add(phoneNumber);
        mainPanel.add(new Label("El. Paštas"));
        mainPanel.add(email);
        mainPanel.add(new Label("Komentaras"));
        mainPanel.add(comment);
        mainPanel.add(load);
        mainPanel.add(save);
        //End components


        FileFilter emp = new FileFilter() {
            @Override
            public boolean accept(File f) {
                if(f.getName().endsWith(".emp")){
                    return true;
                }else {
                    return false;
                }
            }

            @Override
            public String getDescription() {

                return "Darbuotojo failai (*.emp)";
            }
        };
        load.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                fc.setFileFilter(emp);
                fc.showOpenDialog(frame);
                File file = fc.getSelectedFile();
                FileInputStream fileInput = null;
                try {
                    fileInput = new FileInputStream(file);
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                ObjectInputStream objectInput = null;
                try {
                    objectInput = new ObjectInputStream(fileInput);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                try {
                    Execute.employee = (Employee) objectInput.readObject();
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }

                try {
                    objectInput.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                name.setText(employee.name);
                surname.setText(employee.surname);
                phoneNumber.setText(employee.phoneNumber);
                email.setText(employee.email);
                comment.setText(employee.comment);
            }
        });



        save.addActionListener(e ->

    {
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(emp);
        fc.showSaveDialog(frame);
        File file = fc.getSelectedFile();
        FileOutputStream fileOutput = null;
        try {
            fileOutput = new FileOutputStream(file);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        employee.name = name.getText();
        employee.surname = surname.getText();
        employee.phoneNumber = phoneNumber.getText();
        employee.email = email.getText();
        employee.comment = comment.getText();


    });

        frame.setSize(700,600);
        frame.setVisible(true);

}
}
