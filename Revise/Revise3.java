import java.util.Scanner;

public class Revise3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int sum = 0;

        while(num > 0){
            int digit =  num % 10; // last digit 
            sum = sum + digit ; // sum last digit with sum which is zero in first loop 
            num = num / 10 ; // then we remove the last digit 
        }

        System.out.print("Sum of digits = "+ sum);
        

    }
}