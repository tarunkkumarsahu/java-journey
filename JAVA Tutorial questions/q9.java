// public class q9{
//     public static void main(String[] args){
//         int[] arr = {12,5,78,45,23};

//         int largest = arr[0];

//         for(int i= 1 ; i < arr.length ; i++){
//             if(arr[i] > largest){
//             }
//         }

//         System.out.println("Largest = "+ largest);
//     }
// }
import java.util.Scanner;
public class q9{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){

            System.out.println("Enter the size of array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            for(int i = 0 ; i < size ; i++){
                arr[i] = sc.nextInt();
            }

            int largest = arr[0];

            for(int i = 0 ; i < size ; i++){
                if(arr[i] > largest){
                    largest = arr[i];
                }
            }

            System.out.println("Largest is " + largest );
        }
    }
}