import java.util.Scanner;

public class ReadIntegerUsingScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("You entered: " + number);

        sc.close();
    }
}