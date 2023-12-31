
/**
 * Represents a Checking Account.
 *
 * @author Sophie Lin and Linda Dominguez
 * @version October 12, 2023
 */
public class CheckingAccount extends Account
{
    private final double min = 100;
    private final double fee = 25;
    public CheckingAccount(double b1){
        super(b1);
    }
    /**
     * Withdraws the given amount form the checking account and incurs a fee if the balance is below the minimum
     *
     * @param  amt  the amount of money to be withdrawn
     */
    public void withdraw(double amt)
    {
        if(amt > this.balance)
            System.out.println("** Withdrawal DENIED **: Insufficient balance.");
        else{
            this.balance -= amt;
            if(this.balance < min) {//overdraft fee
                this.balance -= fee;
                System.out.println("** NOTE: Balance is low. Overdraft Fee was charged.");
            }
        }
    }
    /**
     * Prints out the details of the Checking Account
     *
     * @return  the String representation of the Checking Account
     */
    public String toString()
    {
        return "Checking Account\nAccount Number: " + accountNum + "\nBalance: $" + balance
                + "\nMinimum balance: " + min+ "\nOverdraft fee:" + fee;
    }
}
