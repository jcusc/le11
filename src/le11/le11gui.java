package le11;
import javax.swing.JOptionPane;

public class le11gui {
	public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter amount (from 1 - 99 cents):");
        if (input != null) {
            int amount = Integer.parseInt(input);

            int quarters = amount / 25;
            int rem = amount % 25;

            int dimes = rem / 10;
            rem %= 10;

            int nickels = rem / 5;
            int pennies = rem % 5;

            String message = String.format("Your change is:\n%d quarter(s)\n%d dime(s)\n%d nickel(s)\n%d penny/pennies", 
                                            quarters, dimes, nickels, pennies);
            JOptionPane.showMessageDialog(null, message);
        }
    }
}

