import java.util.*;
public class Bank {
    public static void main(String[] args) {
     BankAccount b=new BankAccount("Alfa","Honoured_1");
     b.showMenu();
    }
}
class BankAccount{
    int balance,previousTransaction;
    String CustomerName,CustomerID;
    BankAccount(String Cname,String Cid){
        this.CustomerName=Cname;
        this.CustomerID=Cid;
    }
    void deposit(int amount){
        if(amount>0) {
            balance += amount;
            previousTransaction = amount;
        }
    }
    void withdraw(int amount){
        if(amount>0) {
            balance -= amount;
            previousTransaction = -amount;
        }
    }
    void getPreviousTransaction(){
        if(previousTransaction>0){
            System.out.println(previousTransaction+" Deposited");
        } else if (previousTransaction<0) {
            System.out.println(previousTransaction+" Withdrawn");
        }else{
            System.out.println("No transaction Occurred");
        }
    }

    void showMenu(){
        Scanner sc = new Scanner(System.in);
        char ch; // default value
        System.out.println();
        System.out.println("Welcome "+CustomerName);
        System.out.println("Your ID is :"+CustomerID);
        System.out.println("\n");

        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Enter your choice");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("\n");
            ch=sc.next().charAt(0);
           // System.out.println("\n");

            switch (ch){
                case 'A':
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Balance ="+balance);
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println();
                    break;
                case 'B':
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Enter Amount");
                    int a=sc.nextInt();
                    deposit(a);
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println();
                    break;
                case 'C':
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Enter Amount");
                    int a1=sc.nextInt();
                    withdraw(a1);
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println();
                    break;
                case 'D':
                    System.out.println("-------------------------------------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 'E':
                    System.out.println("Thank You for Using our Service");
                default:
                    System.out.println("Wrong Choice");
                    break;
            }

        }while(ch!='E');

    }
}