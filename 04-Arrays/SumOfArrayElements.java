// public class q8{
//     public static void main(String[] args){
//         int[] array = {10,20,30,40,50};
//         int sum = 0;
//         for(int i = 0; i< array.length ; i++ ){
//             sum = sum+array[i];
//         }
//         System.out.println(sum);
//     }
// }

// if we will take the input of array then our code become 

import java.util.Scanner;


public class SumOfArrayElements{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.print("Enter the size of array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter the elements: ");

            for(int i = 0 ; i < size ; i++){
                arr[i] = sc.nextInt();
            }

            int sum = 0;

            for(int i = 0 ; i < size ; i++){
                sum += arr[i];
            }

            System.out.println("Sum = "+ sum);

        }
    }
}

// this is intresting 