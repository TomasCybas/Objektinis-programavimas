package namudarbas17;

import javax.swing.*;
import java.awt.*;

public class Exxecute {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel container = new JPanel();
        frame.add(container);
        JLabel timerField = new JLabel("15");
        JPanel mainPanel = new JPanel(new GridLayout(2, 2));
        container.add(mainPanel);
        JLabel problem = new JLabel("užduotis");
        mainPanel.add(problem);
        JTextField answerField = new JTextField(15);
        mainPanel.add(answerField);
        JButton startGame = new JButton("Pradėti naują žaidimą");
        mainPanel.add(startGame);
        container.add(timerField);

        Timer timer = new Timer(5, timerField);
        timer.start();


        frame.setSize(400, 400);
        frame.setVisible(true);

        startGame.addActionListener( e -> {
            timer.setTime(0);
            timer.setStarted(true);
            System.out.println(timer.isStarted());
        });

    }
}
