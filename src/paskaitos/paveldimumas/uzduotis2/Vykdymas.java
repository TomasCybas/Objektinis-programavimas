package paskaitos.paveldimumas.uzduotis2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Vykdymas {
    public static void main(String[] args) {

        JFrame f = new JFrame("Lango pavadinimas");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new CustomPanel();

        f.add(panel);
        f.setSize(800,600);
        f.setVisible(true);
    }
}
