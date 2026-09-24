import java.util.Scanner;

public class ReadIntegerRevision{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number: ");
            int number = sc.nextInt();

            System.out.println("The number is: " + number);
        }
    }
}