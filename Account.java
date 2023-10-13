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