import java.util.Scanner;

public class InputAndPrintMatrix{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Rows: ");
            int rows = sc.nextInt();

            System.out.print("Columns: ");
            int cols = sc.nextInt();

            int[][] arr = new int[rows][cols];

            System.out.println("Enter elements:");

            for(int i = 0; i < rows; i++) {
               for(int j = 0; j < cols; j++) {
                   arr[i][j] = sc.nextInt();
                }
            }

            System.out.println("Matrix:");

            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    System.out.print(arr[i][j] + " ");
               }
                System.out.println();
            }

        }
    }
}