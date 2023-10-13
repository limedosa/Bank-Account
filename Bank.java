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
        String rep = "Current state of Bank:\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+
        "This bank manages " + count + " accounts\n";
        for(int i = 0; i < count;i++){
            rep += bank[i] + "\n";
        }
        rep += "\nTotal Funds: "+calculateFunds();
        return rep;
    }
    /**
     * Returns the total amount of money in all the accounts in the bank
     * @return double total amount of money in all the accounts in the bank
     */
    public double calculateFunds(){
        double total  = 0;
        for(int i = 0; i < count;i++){
            total += bank[i].balance;
        }
        return total;
    }
    public static void main(String[] args){
        Scanner newScan = new Scanner (System.in);
        Bank bank1 = new Bank();
        //create accounts
        boolean done = false;
        while(!done) {
            System.out.println("Welcome to x Bank! /n There are two types of accounts; checking and savings. \nDo you want to open a checking account?(y/n)");
            String checking = newScan.nextLine();
            //if user said yes then make checking
            if (checking.contains("y")) {
                System.out.println("What do you want to set the balance to?");
                double amt = newScan.nextDouble();
                Account newChecking = new CheckingAccount(amt);//make checking account with balance amt
                bank1.add(newChecking);
                System.out.println("Checking account successfully created!");
            }
            System.out.println("Great! \nDo you want to open a savings account?(y/n)");
            String savings = newScan.nextLine();
            savings = newScan.nextLine();
            //if user said yes then make checking
            if (savings.contains("y")) {
                System.out.println("What do you want to set the balance to?");
                double amt = newScan.nextDouble();
                Account newSavings = new SavingsAccount(amt);//make savings account with balance amt
                bank1.add(newSavings);
                System.out.println("Savings account successfully created!\n Welcome to our Bank, " +newSavings.accountName +".");
            }
            System.out.println("Do you want to create more accounts?(y/n)");
            String ans = newScan.nextLine();
            ans = newScan.nextLine();
            if (ans.contains("n"))
                done = true;
        }
        System.out.println(bank1);

        System.out.println("[Depositing $4000 into Checking #0. Should print Acct#0, Bal=$5000, Min=$100]");
        bank1.bank[0].deposit(4000);
        System.out.println(bank1.bank[0]);
        System.out.println();

        System.out.println("[Withdrawing $6K -- MORE THAN AVAILABLE from Checking #0]");
        bank1.bank[0].withdraw(6000);
        System.out.println(bank1.bank[0]);
        System.out.println();

        System.out.println("[Withdrawing $4901 from Checking #0 triggers Overdraft: Bal=$74.00]");
        bank1.bank[0].withdraw(4901);
        System.out.println(bank1.bank[0]);
        System.out.println();

        System.out.println("[Allowed Withdrawing $70 from Checking #0 triggers Overdraft: Bal=-$21.00]]");
        bank1.bank[0].withdraw(70);
        System.out.println(bank1.bank[0]);
        System.out.println(bank1);
        System.out.println();

        System.out.println("[Withdrawing from NEGATIVE funds not allowed]");
        bank1.bank[0].withdraw(5);
        System.out.println(bank1.bank[0]);
        System.out.println();

        System.out.println("[Depositing $100 into Checking #0. Should print Acct#0, Bal=$79, Min=$100]");
        bank1.bank[0].deposit(100);
        System.out.println(bank1.bank[0]);
        System.out.println();

        System.out.println(bank1);
        System.out.println();

        System.out.println("[Depositing $2000 into Savings 1. Should print Acct#1, Bal=$3000, Int=0.5%]");
        bank1.bank[1].deposit(2000);
        System.out.println(bank1.bank[1]);
        System.out.println();

        System.out.println("[Withdrawing $5K MORE THAN AVAILABLE from Savings #1]");
        bank1.bank[1].withdraw(5000);
        System.out.println(bank1.bank[1]);
        System.out.println();

        System.out.println("[Withdrawing $3K from Savings #1]");
        bank1.bank[1].withdraw(3000);
        System.out.println(bank1.bank[1]);
        System.out.println();

        //assuming theres 3 accounts
        System.out.println(bank1.findNum(3));
    }
}
