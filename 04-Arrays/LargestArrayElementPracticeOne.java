import java.util.Scanner;

public class LargestArrayElementPracticeOne {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] arr =  new int[size];

            for(int i = 0 ; i < size ; i++){
                arr[i] = sc.nextInt();
            }

            int largest = arr[0];

            for(int i = 1 ; i < size ; i++){
                if(arr[i]>largest){
                    largest = arr[i];
                }
            }

            System.out.println("Largest is: "+ largest);
        }
    }
}