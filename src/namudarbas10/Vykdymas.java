package namudarbas10;

import javax.swing.*;
import java.awt.*;

public class Vykdymas {
    public static JLabel grossSalaryOutput;
    public static JLabel incomeTaxOutput;
    public static JLabel healthInsuranceOutput;
    public static JLabel socialSecurityInsuranceOutput;
    public static JLabel netSalaryOutput;
    public static JLabel sodraOutput;
    public static JLabel totalEmploymentCostOutput;
    public static JLabel NPDOutput;

    public static void main(String[] args) {
        JFrame f = new JFrame("Lango pavadinimas");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel background = new JPanel();
        JPanel mainPanel = new JPanel(new GridLayout(14, 2));
        f.add(background);

        // Begin components
        background.add(mainPanel);
        JLabel salaryLabel = new JLabel("Atlkyginimas į rankas, EUR");
        mainPanel.add(salaryLabel);
        JTextField salaryInput = new JTextField(15);
        mainPanel.add(salaryInput);
        JLabel NPDInputLabel = new JLabel("Taikomas NPD");
        mainPanel.add(NPDInputLabel);
        JTextField NPDInput  = new JTextField("300");
        mainPanel.add(NPDInput);
        JLabel NPDOutputLabel = new JLabel("Pritaikytas NPD");
        mainPanel.add(NPDOutputLabel);
        NPDOutput = new JLabel("0.00 EUR", SwingConstants.RIGHT);
        mainPanel.add(NPDOutput);
        JLabel grossSalaryLabel = new JLabel("Priskčiaičuotas atlyginimas \"ant popieriaus\" ");
        mainPanel.add(grossSalaryLabel);
        grossSalaryOutput = new JLabel("0.00 EUR", SwingConstants.RIGHT);
        mainPanel.add(grossSalaryOutput);
        JLabel incomeTaxLabel = new JLabel("Pajamų mokestis 15 %");
        mainPanel.add(incomeTaxLabel);
        incomeTaxOutput = new JLabel("0.00 EUR", SwingConstants.RIGHT);
        mainPanel.add(incomeTaxOutput);
        JLabel healthInsuranceLabel = new JLabel("Sodra. Sveikatos draudimas 6%");
        mainPanel.add(healthInsuranceLabel);
        healthInsuranceOutput = new JLabel("0.00 EUR", SwingConstants.RIGHT);
        mainPanel.add(healthInsuranceOutput);
        JLabel socialSecurityInsuranceLabel = new JLabel("Sodra. Pensijų ir soc. draudimas 3%");
        mainPanel.add(socialSecurityInsuranceLabel);
        socialSecurityInsuranceOutput = new JLabel("0.00 EUR", SwingConstants.RIGHT);
        mainPanel.add(socialSecurityInsuranceOutput);
        JLabel netSalaryLabel = new JLabel("Išmokamas atlyginimas į rankas");
        mainPanel.add(netSalaryLabel);
        netSalaryOutput = new JLabel("0.00 EUR", SwingConstants.RIGHT);
        mainPanel.add(netSalaryOutput);
        JLabel sodraLabel = new JLabel("Sodra 1.77%");
        mainPanel.add(sodraLabel);
        sodraOutput = new JLabel("0.00 EUR", SwingConstants.RIGHT);
        mainPanel.add(sodraOutput);
        JLabel totalEmploymentCostLabel = new JLabel("Visa darbo vietos kaina");
        mainPanel.add(totalEmploymentCostLabel);
        totalEmploymentCostOutput = new JLabel("0.00 EUR", SwingConstants.RIGHT);
        mainPanel.add(totalEmploymentCostOutput);
        JButton button1 = new JButton("Skaičiuoti");
        button1.addActionListener(new Calculate(salaryInput, NPDInput));
        mainPanel.add(button1);
        //End Components

        f.setSize(800,600);
        f.setVisible(true);

    }
}
