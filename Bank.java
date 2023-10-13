import java.util.Scanner;

/**
 * Represents a Bank
 *
 *  @author Sophie Lin and Linda Dominguez
 * @version October 12, 2023
 */
public class Bank {
    private Account[] bank;
    private int count = 0;

    /**
     * Constructor for a Bank that creates 10 possible spaces for accounts
     */
    public Bank(){
        bank = new Account[10];
    }
    /**
     * Adds an account to the bank, and sets the account number
     * @param x Account to add to the bank
     */
    public void add(Account x){
        if(count < bank.length) {
            bank[count] = x; //adds the account to the bank collection
            x.accountNum = count; //adds the account number to the account object
            count++;
        }
        else
            System.out.println("No more space in this Bank");
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
        String rep = "This bank manages " + count + " accounts";
        for(int i = 0; i < bank.length;i++){
            rep += bank[i] + "\n";
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
    }
}
