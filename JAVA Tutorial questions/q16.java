// mini ATM 
import java.util.Scanner;
public class q16{
    public static void main(String [] args){
        try(Scanner sc = new Scanner(System.in)){

            int balance = 1000;

            System.out.println("1. Check Balance");
            System.out.println("2. Deposite");
            System.out.println("3 Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Balance = "+ balance);
                    break;

                case 2:
                    System.out.println("Enter deposite amount: ");
                    int deposite = sc.nextInt();

                    balance += deposite;

                    System.out.println("Updated amount: " + balance);
                    break;
                case 3:
                    System.out.println("Enter withdraw amount: ");
                    int withdraw = sc.nextInt();

                    if(withdraw <= balance){
                        balance -= withdraw;
                        System.out.println("Updated balance = " + balance );
                    }else{
                        System.out.println("Insufficient Balance");
                    }
                    break;
                case 4:
                    System.out.println("Thankyou");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}