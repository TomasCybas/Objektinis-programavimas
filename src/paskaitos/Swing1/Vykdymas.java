package paskaitos.Swing1;

import paskaitos.paveldimumas.uzduotis2.CustomPanel;

import javax.swing.*;
import java.awt.*;

public class Vykdymas {
    public static JLabel result;


    public static void main(String[] args) {
        JFrame f = new JFrame("Lango pavadinimas");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        JPanel jp = new JPanel(new GridLayout(3, 2));
        f.add(mainPanel);
        // Begin components
        mainPanel.add(jp);
        jp.add(new JLabel("Svoris: "));
        JTextField weight = new JTextField(15);
        jp.add(weight);
        jp.add(new JLabel("Ugis: "));
        JTextField height = new JTextField(15);
        jp.add(height);
        result = new JLabel("Atsakymas");
        jp.add(result);
        JButton button1 = new JButton("Skaiciuoti KMI");
        button1.addActionListener(new ButtonPressed(weight, height));
        jp.add(button1);


        //End components
        f.setSize(800,600);
        f.setVisible(true);

    }
}
