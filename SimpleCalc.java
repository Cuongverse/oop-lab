import javax.swing.JOptionPane;

public class SimpleCalc {
    public static void main(String[] args) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null, "Enter the first number", "First Number Input", JOptionPane.INFORMATION_MESSAGE);
        if (strNum1 == null || strNum1.trim().isEmpty()) return;

        strNum2 = JOptionPane.showInputDialog(null, "Enter the second number", "Second Number Input", JOptionPane.INFORMATION_MESSAGE);
        if (strNum1 == null || strNum1.trim().isEmpty()) return;

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double product = num1 * num2;
        double difference = num1 - num2;

        String quotient = (num2 == 0) ? "Cannot divide by zero" : String.valueOf(num1 / num2);

        String msg = String.format(
            "First number: %.2f\n Second number: %.2f\n\n" +
            "Sum: %.2f\n" +
            "Difference: %.2f\n" +
            "Product: %.2f\n" +
            "Quotient: %s\n",
            num1, num2, sum, difference, product, quotient 
        );
        
        JOptionPane.showMessageDialog(null, msg, "Calculation Results", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}


