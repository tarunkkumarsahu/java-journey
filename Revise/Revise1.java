import java.util.Scanner;


public class Revise1{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        int total = num1 + num2;

        System.out.print("Sum of two number is: " + total);

    }
}