public class RecursionPrintFiveRepeatedly {
    public static void printNumber(int n){
        if(n == 0){
            return ;
        }
        System.out.println(5);
        printNumber(n - 1);
    }
    public static void main(String[] args){
        printNumber(5);
    }
}