import java.util.Scanner;

public class practice2{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter the size: ");
            int size = sc.nextInt();

            int[] arr = new int[size]; 

            System.out.println("Enter the elements: ");

            for(int i = 0 ; i < size ; i++){
                arr[i] =sc.nextInt();
            }

            int largest = arr[0];

            for(int i = 0; i < size ; i++){
                if(arr[i]>largest){
                    largest = arr[i];
                }
            }
            System.out.println("largest ="+ largest);
        }
    }
}