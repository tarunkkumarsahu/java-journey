// right triangle with 1111 2222 3333
// 

import java.util.Scanner;

public class RepeatedRowNumberTriangle{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter rows: ");
            int rows = sc.nextInt();

            for(int i = 1 ; i <= rows ; i++){
                for(int j = 1 ; j <= i ; j++){
                    System.out.print(i +" ");
                }
                System.out.println();
            }
        }
    }
}