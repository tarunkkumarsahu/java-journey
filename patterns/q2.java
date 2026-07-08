// square/rectangle by user input 

import java.util.Scanner;


public class q2{
    public static void main(String [] args){
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter rows: ");
            int row = sc.nextInt();

            System.out.print("Enter columns: ");
            int cols = sc.nextInt();

            for(int i = 0; i < row ; i++){
                for(int j = 0; j < cols; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}