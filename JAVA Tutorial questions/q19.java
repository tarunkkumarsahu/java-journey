import java.util.Scanner;

public class q19{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter the elements: ");

            for(int i = 0 ; i < size ; i++){
                arr[i] = sc.nextInt();
            }

            int even = 0;
            int odd = 0;
            
            for(int i = 0 ; i < size ; i++){
                if(arr[i] % 2 == 0 ){
                    even++;
                }
                else{
                    odd++;
                }
                
            }
            System.out.println("Total even number = " + even);
            System.out.println("Total odd number = " + odd);

        }
    }
}









// int count = 0; 

// for(int i = 0 ; i < even.length ; i++){
//     if(even[i] % 2 == 0 ){
//         count++;
//     }
// }
// System.out.println("Even = "+ count);