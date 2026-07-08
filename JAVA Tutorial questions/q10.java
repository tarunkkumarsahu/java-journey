import java.util.Scanner;

public class q10{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter the size: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            for(int i = 0 ; i < size ; i++){
                arr[i] = sc.nextInt();
            }

            int smallest = arr[0];

            for(int i = 1; i < size ; i++){
                if(arr[i]<smallest){
                    smallest = arr[i];
                }
            }
            System.out.println("Smallest is " + smallest);
        }
    }
}