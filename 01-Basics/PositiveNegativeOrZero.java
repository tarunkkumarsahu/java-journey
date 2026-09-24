import java.util.Scanner;

public class PositiveNegativeOrZero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        if(number>0){
            System.out.println("Number is positive");
        }
        else if(number == 0){
            System.out.println("Number is zero");
        }
        else{
            System.out.println("Number is Negative");
        }
    }
}