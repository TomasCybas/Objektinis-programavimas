package namudarbas10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Calculate implements ActionListener {
    JTextField salaryInput;
    JTextField NPDInput;

    public Calculate (JTextField salaryInput, JTextField NPDInput){
        this.salaryInput = salaryInput;
        this.NPDInput = NPDInput;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        DecimalFormat df = new DecimalFormat("#.##");
        Double salary = Double.parseDouble(salaryInput.getText());
        Double npd = Double.parseDouble(NPDInput.getText());
        int mms = 555;
        if (salary > mms) {
            npd = npd - 0.15 * (salary - mms);
        }

        Double incomeTax = (salary - npd) * 0.2;
        Double healthInsurance = salary * 0.0698;
        Double socialInsurance = salary * 0.1252;
        Double netSalary = salary - incomeTax - socialInsurance - healthInsurance;
        Double sodra = salary * 0.0177;
        Double totalCost =  netSalary + sodra + healthInsurance + socialInsurance + incomeTax;

        Vykdymas.NPDOutput.setText(df.format(npd) + " EUR");
        Vykdymas.incomeTaxOutput.setText(df.format(incomeTax) + " EUR");
        Vykdymas.socialSecurityInsuranceOutput.setText(df.format(socialInsurance) + " EUR");
        Vykdymas.healthInsuranceOutput.setText(df.format(healthInsurance) + " UR");
        Vykdymas.grossSalaryOutput.setText(df.format(salary) + " EUR");
        Vykdymas.netSalaryOutput.setText(df.format(netSalary) + " EUR");
        Vykdymas.sodraOutput.setText(df.format(sodra) + " EUR");
        Vykdymas.totalEmploymentCostOutput.setText(df.format(totalCost) + " EUR");

    }
}
