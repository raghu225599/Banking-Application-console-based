package java4;

import java.util.Scanner;

public class BankAccount {
/*4. Create a Java program that simulates a bank account. The program should allow
users to deposit and withdraw money, check their balance.
     */
    private static double balance;

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(true) {
            System.out.println("WELCOME TO THE BANK");
            System.out.println("press 1 to Deposit money");
            System.out.println("press 2 to withdraw money");
            System.out.println("press 3 to check the balance");
            System.out.println("press 4 to exit");
            System.out.print("enter your choice:");
            int ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("enter the deposit amount:");
                    double depositAmt=scanner.nextDouble();
                    System.out.println("amount deposited successfully the balance is: "+depositMoney(depositAmt));
                    break;
                case 2:
                    System.out.print("enter the withdraw amount:");
                    double withdrawAmt=scanner.nextDouble();
                    System.out.println("amount withdrawn successfully the balance is: "+withdrawMoney(withdrawAmt));
                    break;
                case 3:
                    double bal=checkBalance();
                    System.out.println("The balance in your account is:"+bal);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong input please try again...");
                    break;
            }
        }
    }

    public static double depositMoney(double depositAmt){
        balance=getBalance()+depositAmt;
        return getBalance();
    }
    public static double withdrawMoney(double withdrawAmt){
        balance=getBalance()-withdrawAmt;
        return getBalance();
    }
    public static double checkBalance(){
        return getBalance();
    }

    public static double getBalance(){
        return balance;
    }
}
