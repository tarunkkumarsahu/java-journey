import java.util.Scanner;

public class LargestOfThreeWithInput{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter Three numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a>b && a>c){
                System.out.println(a + " is greater");
            }
            else if(b>a && b>a){
                System.out.println(b + " is greater");
            }
            else{
                System.out.println(c+ " is greater");
            }
        }
    }
}

// this is also calles Try with resourse 