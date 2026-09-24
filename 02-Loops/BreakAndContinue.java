public class BreakAndContinue{
    public static void main(String[] args){
        int[] numbers = {-12, 23, 34,-22 ,22, 45 ,56, 0, 43};
        for(int n : numbers){
            if(n<0){
                continue;
            }
            if(n==0){
                break;
            }
            System.out.println(n);
        }
    }

}

//in this program we also see the array 