// public class SumUptoFive{
//     public static void main(String [] args){
//         int sum = 0 ;
//         for( int i = 1 ;i <= 5; i++){
//             sum = sum + i;
        
//         }
//             System.out.println("Sum of 1 to 5 number is: " + sum );
        
        
//     }
    
// }

public class SumUptoFive {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <= 5; i++) {
            sum += i;

            System.out.print(i);

            if(i < 5) {
                System.out.print(" + ");
            }
        }

        System.out.println(" = " + sum);
    }
}