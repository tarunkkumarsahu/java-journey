import java.util.Scanner;

public class q17{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int secret = 7;

            System.out.print("Enter the number between 1 to 10: ");
            int number = sc.nextInt();

            if(number == secret){
                System.out.println("Your guessing is correct");
            }
            else {
                System.out.println("Your guessing is wrong");
            }
        }
    }
}