import java.util.Scanner;


public class Revise4{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        while(num > 0){
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }

    }
}