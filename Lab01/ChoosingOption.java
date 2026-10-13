package Lab01;

import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        // int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticker?");

        // JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION ? "Yes":"No"));
        // if users choose "Cancel" it returns "You've chosen No"
        // to customize choices, we can do as follows:

        String[] options = {"I do", "I don't"};

        int newOption = JOptionPane.showOptionDialog(null, 
                                                    "Do you want to choose this?", 
                                                    "Confirm Choice", 
                                                    JOptionPane.YES_NO_OPTION, 
                                                    JOptionPane.QUESTION_MESSAGE,
                                                    null,
                                                    options,
                                                    options[0]);

        if (newOption == 0){
            JOptionPane.showMessageDialog(null, "User chose 'I do'.");
        }
        else if(newOption == 1){
            JOptionPane.showMessageDialog(null, "User chose 'I don't'.");
        }
        else if(newOption == JOptionPane.CLOSED_OPTION){
            JOptionPane.showMessageDialog(null, "User closed the dialog.");
        }
        System.exit(0);
    }
}
