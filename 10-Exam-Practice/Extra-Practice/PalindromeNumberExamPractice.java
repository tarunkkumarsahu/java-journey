import java.util.Scanner;

class PalindromeNumberExamPractice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;

        while (num>0){
            int digit = num % 10;
            rev = rev *10+ digit;
            num = num / 10;

        }

        if(temp == rev ){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not palindrome");
        }

    }
}