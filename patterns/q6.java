// right triangle 12345678
// 

import java.util.Scanner;

public class q6{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter rows: ");
            int rows = sc.nextInt();

            int num = 1;

            for(int i = 1 ; i <= rows ; i++){
                for(int j = 1 ; j <= i ; j++){
                    System.out.print(num +" ");
                    num++;
                }
                System.out.println();
            }
        }
    }
}