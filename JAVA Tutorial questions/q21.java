import java.util.Scanner;

public class q21{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter the size: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter the elements: ");

            for(int i = 0 ; i < size ; i++){
                arr[i] = sc.nextInt();
            }

            int largest = arr[0];
            int secondLargest = arr[0];

            for(int i = 1 ; i < size ; i++){
                if(arr[i]>largest){
                    secondLargest = largest ;
                    largest = arr[i];
                }
                else if(arr[i] > largest && arr[i] != largest){
                    secondLargest = arr[i];
                }
            }
            System.out.println("Largest = "+largest);
            System.out.println("Second largest = "+ secondLargest);
        }
    }
}