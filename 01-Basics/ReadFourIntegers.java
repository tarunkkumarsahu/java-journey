import java.util.Scanner;


public class ReadFourIntegers{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number 1: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the number 2: ");
            int num2 = sc.nextInt();
            System.out.print("Enter the number 3: ");
            int num3 = sc.nextInt();
            System.out.print("Enter the number 4: ");
            int num4 = sc.nextInt();

            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num4);
        }
    }
}