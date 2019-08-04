package namudarbas16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Execute {
    public static void main(String[] args) {

        // UI Begins
        JFrame frame = new JFrame("Patiekalai");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        // Components Begins
        JPanel main = new JPanel(new GridLayout(4, 2));
        panel.add(main);
        JTextField surnameField = new JTextField(15);
        main.add(new JLabel("Pavardė"));
        main.add(surnameField);
        JTextField phoneNumber = new JTextField(15);
        main.add(new JLabel("Telefono numeris"));
        main.add(phoneNumber);
        JButton addContact = new JButton("Pridėti kontaktą");
        main.add(addContact);
        DefaultComboBoxModel<Contact> model = new DefaultComboBoxModel<>();
        JComboBox<Contact> contactList = new JComboBox<>(model);
        main.add(contactList);
        JLabel phoneNumberOutput = new JLabel("");
        main.add(phoneNumberOutput);
        //Components ends
        frame.setSize(700, 600);
        frame.setVisible(true);
        //UI Ends


        Map<Contact, LinkedList<String>> contactListMap = new HashMap<>();


        addContact.addActionListener(e -> {
            Contact contact = new Contact(surnameField.getText());
            if (contactListMap.containsKey(contact)){
                contactListMap.get(contact).add(phoneNumber.getText());
            }else{
                contactListMap.put(contact, new LinkedList<>());
                contactListMap.get(contact).add(phoneNumber.getText());
            }
            phoneNumber.setText("");
            System.out.println(contactListMap.keySet());
            for (Contact key : contactListMap.keySet()){
                if (model.getIndexOf(key) == -1) {
                    model.addElement(key);
                }
            }
        });

        contactList.addActionListener(e->{
            JComboBox cb = (JComboBox)e.getSource();
            Contact contact = (Contact)cb.getSelectedItem();
            phoneNumberOutput.setText(contact + " telefono numeriai: " + contactListMap.get(contact).toString());
            System.out.println(contactListMap.get(contact));
        });

        }
    }

