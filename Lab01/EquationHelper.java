package Lab01;
import javax.swing.JOptionPane;

public class EquationHelper {
    public static void main(String[] args) {
        String choices;

        choices = JOptionPane.showInputDialog(null, "1. Linear equation with one variable (ax + b = 0)\n" +
            "2. System of linear equations with two variables\n" +
            "3. Quadratic equation (ax^2 + bx + c = 0)\n\n" +
            "Choose an option (1-3):",
            "Equation Solver Menu", JOptionPane.QUESTION_MESSAGE);
        if (choices == null || choices.trim().isEmpty()){
            System.out.println("Please Enter Valid Value!");
            return;
        }
        int choicesNum = Integer.parseInt(choices);
        if (choicesNum == 1){
            FirstDegreeHelper();
        }
        else if(choicesNum == 2){
            FirstDegreeSystemHelper();
        }
        else if (choicesNum == 3){
            SecondDegreeHelper();
        }
        else{
            JOptionPane.showMessageDialog(null, "INVALID VALUE", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void FirstDegreeHelper(){
        String strA, strB, res;

        strA = JOptionPane.showInputDialog(null, "Enter a", "Input", JOptionPane.QUESTION_MESSAGE);
        if (strA == null || strA.trim().isEmpty()){
            return;
        }

        strB = JOptionPane.showInputDialog(null, "Enter b", "Input", JOptionPane.INFORMATION_MESSAGE);
        if (strB == null || strB.trim().isEmpty()){
            return;
        }

        double a = Double.parseDouble(strA);
        if (a == 0){
            JOptionPane.showMessageDialog(null, "a cannot be 0", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double b = Double.parseDouble(strB);

        res = String.format("x = %.2f", -b/a);
        JOptionPane.showMessageDialog(null, res, "Calculation Results", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void FirstDegreeSystemHelper(){
        String strA11, strA12, strB1, strA21, strA22, strB2;
        double x1, x2;

        strA11 = JOptionPane.showInputDialog(null, "Enter a11", "Input", JOptionPane.INFORMATION_MESSAGE);
        if (strA11 == null || strA11.trim().isEmpty()){
            return;
        }

        strA12 = JOptionPane.showInputDialog(null, "Enter a12", "Input", JOptionPane.INFORMATION_MESSAGE);
        if (strA12 == null || strA12.trim().isEmpty()){
            return;
        }

        strB1 = JOptionPane.showInputDialog(null, "Enter b1", "Input", JOptionPane.INFORMATION_MESSAGE);
        if (strB1 == null || strB1.trim().isEmpty()){
            return;
        }

        strA21 = JOptionPane.showInputDialog(null, "Enter a21", "Input", JOptionPane.INFORMATION_MESSAGE);
        if (strA21 == null || strA21.trim().isEmpty()){
            return;
        }

        strA22 = JOptionPane.showInputDialog(null, "Enter a22", "Input", JOptionPane.INFORMATION_MESSAGE);
        if (strA22 == null || strA22.trim().isEmpty()){
            return;
        }

        strB2 = JOptionPane.showInputDialog(null, "Enter b2", "Input", JOptionPane.INFORMATION_MESSAGE);
        if (strB2 == null || strB2.trim().isEmpty()){
            return;
        }

        double a11 = Double.parseDouble(strA11);
        double a12 = Double.parseDouble(strA12);
        double b1 = Double.parseDouble(strB1);
        double a21 = Double.parseDouble(strA21);
        double a22 = Double.parseDouble(strA22);
        double b2 = Double.parseDouble(strB2);

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        String res;

        if (D != 0){
            x1 = D1 / D;
            x2 = D2 / D;
            res = String.format(
                "x1 = %.2f\n" +
                "x2 = %.2f\n",
                x1, x2);
        }
        else{
            if (D1 == 0 && D2 == 0){
                res = "Infinite Solution";
            }
            else{
                res = "No Solution";
            }
        }
        JOptionPane.showMessageDialog(null, res, "Calculation Results", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void SecondDegreeHelper(){
        String strA, strB, strC;
        double x1, x2, x;

        strA = JOptionPane.showInputDialog(null, "Enter a", "Input", JOptionPane.INFORMATION_MESSAGE);
        if (strA == null || strA.trim().isEmpty()){
            return;
        }

        strB = JOptionPane.showInputDialog(null, "Enter b", "Input", JOptionPane.INFORMATION_MESSAGE);
        if (strB == null || strB.trim().isEmpty()){
            return;
        }

        strC = JOptionPane.showInputDialog(null, "Enter c", "Input", JOptionPane.INFORMATION_MESSAGE);
        if (strC == null || strC.trim().isEmpty()){
            return;
        }

        double a = Double.parseDouble(strA);
        if (a == 0){
            JOptionPane.showMessageDialog(null, "a cannot be 0", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double b = Double.parseDouble(strB);
        double c = Double.parseDouble(strC);

        double discriminant = b * b - 4 * a * c;

        String res;

        if (discriminant > 0){
            x1 = (Math.sqrt(discriminant) - b) / (2 * a);
            x2 = (-Math.sqrt(discriminant) - b) / (2 * a);
            res = String.format(
                "Two Distinct Solutions:\nx1 = %.2f\n" +
                "x2 = %.2f\n",
                x1, x2
            );
        }
        else if (discriminant == 0){
            x = -b / (2 * a);
            res = String.format("One Solution:\nx = %.2f\n", x);
        }
        else{
            res = "No Real Solution";
        }
        JOptionPane.showMessageDialog(null, res, "Calculation Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
