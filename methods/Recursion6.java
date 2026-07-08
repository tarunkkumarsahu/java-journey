public class Recursion6 {

    public static int digitSum(int n) {

        if (n == 0) {
            return 0;
        }

        return (n % 10) + digitSum(n / 10);
    }

    public static void main(String[] args) {

        int result = digitSum(1234);

        System.out.println(result);
    }
}