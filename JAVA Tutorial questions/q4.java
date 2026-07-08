// import java.util.Scanner;

// public class q4{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your number: ");
//         int number = sc.nextInt();

//         for(int i = 1 ; i <=10 ; i++){
//             System.out.println(number +" x "+ i + " = " + (number * i));
//         }
//         sc.close();
//     }
// }

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter your number: ");
            int number = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
    }
}