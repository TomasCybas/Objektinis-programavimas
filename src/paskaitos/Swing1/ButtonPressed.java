package paskaitos.Swing1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPressed implements ActionListener {

    JTextField weight;
    JTextField height;

    public ButtonPressed(JTextField weight, JTextField height ) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Double s = Double.parseDouble(weight.getText());
        Double u = Double.parseDouble(height.getText());
        u=u/100;
        Vykdymas.result.setText("Jusu mases KMI= " + s / (u * u));
    }
}
