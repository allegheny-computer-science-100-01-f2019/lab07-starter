package labseven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Atm class contains the main method.
* It creates two instances of the Account object and uses
* the method within the Account class.
* @author Add Your Names Here
*/

public class Atm {
  /** Main method to implement input and output.
  */
  public static void main(String [] args) {
    // TODO: change the welcome message
    System.out.println("Welcome to JJ ATM!");
    System.out.println();

    // connect the scanner to the input file for user actions
    Scanner scanner = null;
    try {
      File userInput = new File("input/user_input.txt");
      scanner = new Scanner(userInput);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }

    System.out.println("Finding your account information.\n");
    // read in the first two lines in the user_input file
    int pin = scanner.nextInt();
    String accountType = scanner.next();

    // create variables to store account information
    int accountNumber = 0;
    double balance = 0.0;

    // check if the user selected checking or savings account
    // populate the account information from an appropriate file
    if (accountType.equals("checking")) {
      // connect the scanner to the checking file for account details
      Scanner scanner1 = null;
      try {
        File checkingInput = new File("input/checking.txt");
        scanner1 = new Scanner(checkingInput);
      } catch (FileNotFoundException noFile) {
        System.out.println("Unable to locate file");
      }
      System.out.println("Linking to your checking account details.\n");
      accountNumber = scanner1.nextInt();
      balance = scanner1.nextDouble();
    } else if (accountType.equals("savings")) {
      // connect the scanner to the savings file for account details
      Scanner scanner2 = null;
      try {
        File savingsInput = new File("input/savings.txt");
        scanner2 = new Scanner(savingsInput);
      } catch (FileNotFoundException noFile) {
        System.out.println("Unable to locate file");
      }
      System.out.println("Linking to your savings account details.\n");
      accountNumber = scanner2.nextInt();
      balance = scanner2.nextDouble();
    }

    // connect the scanner to the input file for account details
    Scanner scanner3 = null;
    try {
      File offerInput = new File("input/offer.txt");
      scanner3 = new Scanner(offerInput);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    String offerText = scanner3.nextLine();
    int offerId = scanner3.nextInt();

    // TODO: create an instance of an Offer class (one line)

    // TODO: create an instance of an Account class (one line)

    // reading the rest of the info from the user_input file
    String action = scanner.next();
    int amount = scanner.nextInt();

    // First, always check the balance.
    System.out.println("First, let's check your balance");
    System.out.println("Your current balance is $" + account.getBalance());

    // TODO: Now, perform the user defined action (if-else block)
    // Note, the action (either withdraw or deposit) is stored in a variable 'action'

    // TODO: print out the offer id and its text

    // TODO: change the final message
    System.out.println("\nThank you for using JJ ATM!");
  }
}
