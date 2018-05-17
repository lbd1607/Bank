import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 * Laura Davis CIS 260 903
 * This program demonstrates the BankAccont class
 */

public class Bank
{
	public static void main(String[] args)
	{
		String input;
		
		DecimalFormat dollar = new DecimalFormat("#,###.00");
		
		input = JOptionPane.showInputDialog("What is your account's starting balance? ");
		BankAccount account = new BankAccount(input);
		
		input = JOptionPane.showInputDialog("How much were you paid this month? ");
		account.deposit(input);
		JOptionPane.showMessageDialog(null, "Your pay has been deposited. \n" + 
		"Your current balance is $" + dollar.format(account.getBalance()));
		
		input = JOptionPane.showInputDialog("How much would you like to withdraw? ");
		account.withdraw(input);
		JOptionPane.showMessageDialog(null, "Now your balance is $" + dollar.format(account.getBalance()));
		
		System.exit(0);
	}//end of main

}//end of class
