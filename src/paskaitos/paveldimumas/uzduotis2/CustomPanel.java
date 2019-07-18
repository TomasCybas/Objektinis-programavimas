package paskaitos.paveldimumas.uzduotis2;

import javax.swing.*;
import java.awt.*;

public class CustomPanel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(10, 10, 100, 100);

        g.drawLine(0, 300, 800, 300);
    }
}
