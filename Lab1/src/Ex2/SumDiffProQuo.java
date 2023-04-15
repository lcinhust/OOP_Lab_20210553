package Ex2;

import javax.swing.JOptionPane;

public class SumDiffProQuo {
    public static void main(String args[]){
        String strNum1, strNum2;
        
        strNum1 = JOptionPane.showInputDialog(null, 
            "Please input the first number: ",
            "Input the first number",
            JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null, 
            "Please input the second number: ",
            "Input the second number",
            JOptionPane.INFORMATION_MESSAGE);
        
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        String strNotification = "Sum of 2 numbers: " + Double.toString(num1+num2);
        JOptionPane.showMessageDialog(null, 
            strNotification, 
            "Sum of two numbers",
            JOptionPane.INFORMATION_MESSAGE);

        strNotification = "Difference of 2 numbers: " + Double.toString(num1-num2);
        JOptionPane.showMessageDialog(null, 
            strNotification, 
            "Difference of two numbers",
            JOptionPane.INFORMATION_MESSAGE);
            
        strNotification = "Product of 2 numbers: " + Double.toString(num1*num2);
        JOptionPane.showMessageDialog(null, 
            strNotification, 
            "Product of two numbers",
            JOptionPane.INFORMATION_MESSAGE);
        
        if (num2 != 0)
            strNotification = "Quotient of 2 numbers: " + Double.toString(num1/num2);
        else
            strNotification = "Can't do the division";
        JOptionPane.showMessageDialog(null, 
            strNotification, 
            "Quotient of two numbers",
            JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
