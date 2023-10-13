// import java.util.Scanner;

/**
 * Represents a Savings Account
 *
 *  @author Sophie Lin and Linda Dominguez
 * @version October 12, 2023
 */
public abstract class SavingsAccount extends Account
{
    private final double INTEREST = .005;
    private final double MONTHLYINTEREST = (INTEREST/12);

    public SavingsAccount(int accountNum){
        this.accountNum = accountNum;
    }

    /**
     * determines monthly interest accrued 
     * @param None 
     */
    public void accrueMonthlyInterest() {
        double monthlyInterest = balance * (MONTHLYINTEREST);
        balance += monthlyInterest;
    }
    /**
     * Withdraws the given amount form the savinngs account 
     *
     * @param  amt  the amount of money to be withdrawn
     */
    public void withdraw(double amt)
    {
        if(amt > this.balance)
            System.out.println("** Withdrawal DENIED **: Insufficient balance.");
        else{
            this.balance -= amt;
        }
    }
    /**
     * Prints out the details of the Checking Account
     *
     * @return  the String representation of the Checking Account
     */
    public String toString()
    {
        return "Savings Account\nAccount Number: " + accountNum + "\nBalance: $" + balance
        + "\nInterest Rate: " + (INTEREST * 100) + "%";
    }
    /**
     * 
     */
}