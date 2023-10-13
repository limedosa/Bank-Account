<<<<<<< Updated upstream
import java.util.ArrayList;
=======
>>>>>>> Stashed changes

/**
 * Represents a Bank
 *
 *  @author Sophie Lin and Linda Dominguez
 * @version October 12, 2023
 */
public class Bank {
<<<<<<< Updated upstream
    private ArrayList<Account> accounts = new ArrayList<>();
    public Bank(){
        this.accounts = new ArrayList<Account>();
        System.out.println("Bank created successfully!");
        }
        
    /**
     * adds account to bank
     */
    public void addAccountNumber(int accountNum){
account.add(accountNum);
    }
    }
=======
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
    public static void main(String[] args){

    }
}
>>>>>>> Stashed changes
