package paskaitos.lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Execute {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pavadinimas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        JTextField x = new JTextField(10);
        JTextField y = new JTextField(10);
        JButton calculate = new JButton("Skaiciuoti");
        JLabel result = new JLabel("");

        panel.add(x);
        panel.add(y);
        panel.add(calculate);
        panel.add(result);


        calculate.addActionListener((ActionEvent e) -> {
           int number = Integer.parseInt(x.getText()) + Integer.parseInt(y.getText());
           result.setText(number + "");
        });

        frame.setSize(700, 600);
        frame.setVisible(true);
    }
}
