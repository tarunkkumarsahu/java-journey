import java.util.Scanner;

public class AddTwoNumbersMethod{
    public static int myMethod(int x,int y){
        return x + y;
    }
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter the value of x: ");
            int x = sc.nextInt();

            System.out.print("Enter the value of y: ");
            int y = sc.nextInt();

            int z = myMethod(x,y);
            System.out.print(x + " + "  + y +" = " +z);
        }
    }
}