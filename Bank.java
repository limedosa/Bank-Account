
/**
 * Represents a Bank
 *
 *  @author Sophie Lin and Linda Dominguez
 * @version October 12, 2023
 */
public class Bank {
    private Account[] bank;
    private int num = 0;

    /**
     * Constructor for a Bank that creates 10 possible spaces for accounts
     */
    public Bank(){
        bank = new Account[10];
    }
    /**
     * Adds an account to the bank
     * @param x Account to add to the bank
     */
    public void add(Account x){
        if(num < bank.length)
            bank[num] = x;
    }
    /**
     * Finds the account given the number
     * @param index the bank account number that is wanted
     * @return Account with that unique number
     */
    public Account findNum(int index){
        return bank[index];
    }
    /**
     * Returns all the account details in the bank
     * @return String representation of the bank
     */
    public String toString(){
        String rep = "";
        for(int i = 0; i < bank.length;i++){
            rep += bank[i];
        }
        return rep;
    }
    /**
     * Returns the total amount of money in all the accounts in the bank
     * @return double total amount of money in all the accounts in the bank
     */
    public double calculateFunds(){
        double total  = 0;
        for(int i = 0; i < bank.length;i++){
            total += bank[i].balance;
        }
        return total;
    }
    public static void main(String[] args){

    }
}
