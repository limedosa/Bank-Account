import java.util.Random;
import java.util.Scanner;

/**
 * Represents a Bank Account
 *
 *  @author Sophie Lin and Linda Dominguez
 * @version October 12, 2023
 */
public abstract class Account
{
    protected double balance;
    protected int accountNum;
    public String accountName;
    public Account(){
        Scanner newScan = new Scanner (System.in);
        System.out.println("Enter the name of this account: ");
        String newAccountName=newScan.next();
        this.accountName = newAccountName;
        System.out.println("Welcome to x Bank! /n There are two types of accounts; checking and savings. \nDo you want to open a checking account?(y/n)");
        String checking = newScan.nextLine();
        //if user said yes then make checking 
        int newAccountNum = makeAccNum();
        if (checking.contains("y")){
            //make checking account TODO change after method is defined
            CheckingAccount newChecking = new CheckingAccount(newAccountNum);
            System.out.println("Checking account successfully created!");
    }
        System.out.println("Great! \nDo you want to open a savings account?(y/n)");
        String savings = newScan.nextLine();
        //if user said yes then make checking 
        if (savings.contains("y")){
            //make savings account  -- TODO change after method is defined
            SavingsAccount newSavings = new SavingsAccount(newAccountNum);
            System.out.println("Checking account successfully created!\n Welcome to our Bank, "+ accountName  + ".");

    }
    // public static void MINBALANCE
    
}
    /**
     * helper class allows for us to make random account number
     * @param None 
     * @return random int 
     */
    public static int makeAccNum(){
        int min = 1_000_000_000; // smallest 9-digit num
        int max = 999_999_999;  //largest 9 digit num
        Random rand = new Random() ;
        return rand.nextInt(max - min + 1) + min;
    }

    /**
     * Withdraws the given amount form the checking account and incurs a fee if the balance is below the minimum
     *
     * @param  amt  the amount of money to be withdrawn
     */
    public abstract void withdraw(double amt);
    /**
     * Deposit the given amount into the checking account
     *
     * @param  amt  the amount of money to be deposited into account
     */
    public void deposit(double amt){
        balance += amt;
    }
    /**
     * Print out the details of the bank account
     *
     * @return  the String representation of the ] Account
     */
    public abstract String toString();
}