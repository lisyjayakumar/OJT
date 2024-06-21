import javax.swing.JOptionPane;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        // Prompt user to enter first number
        String input1 = JOptionPane.showInputDialog("Enter the first number:");
        int num1 = Integer.parseInt(input1);

        // Prompt user to enter second number
        String input2 = JOptionPane.showInputDialog("Enter the second number:");
        int num2 = Integer.parseInt(input2);

        // Calculate the sum
        int sum = num1 + num2;

        // Display the result in a pop-up dialog
        JOptionPane.showMessageDialog(null, "The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}