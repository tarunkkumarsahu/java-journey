public class LargestOfThree{
    public static void main(String[] args){
        int num1 = 49;
        int num2 = 43;
        int num3 = 33;
        if(num1>num2){
            if(num1>num3){
                System.out.println(num1 +" is the Greater");
            }
            else{
                System.out.print(num3 + " is the Greater");
            }
        }
        else if(num2>num3){
            System.out.println(num2 + " is the Greater");
        }
    }
}