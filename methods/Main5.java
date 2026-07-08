import java.util.Scanner;

public class Main5{
    public static void myMethod(int age){
        if(age>18){
            System.out.println("You are approved");
        }
        else{
            System.out.println("You are not approved");
        }
    }
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            myMethod(age);
        }
    }
}
