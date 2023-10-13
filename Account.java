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
    public Account(){
        Scanner newScan = new Scanner (System.in);
        System.out.println("Welcome to x Bank! /n There are two types of accounts; checking and savings. \nDo you want to open a checking account?(y/n)");
        String checking = newScan.nextLine();
        //if user said yes then make checking 
        if (checking.contains("y")){
            //make checking account TODO change after method is defined
            CheckingAccount newChecking = new CheckingAccount();
    }
        System.out.println("Great! \nDo you want to open a savings account?(y/n)");
        String savings = newScan.nextLine();
        //if user said yes then make checking 
        if (savings.contains("y")){
            //make savings account  -- TODO change after method is defined
            SavingsAccount newSavings = new SavingsAccount();
    }
    // public static void MINBALANCE
    
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