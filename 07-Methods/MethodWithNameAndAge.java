public class MethodWithNameAndAge{
    public static void myMethod(String fname, int age){
        System.out.println(fname + " is " + age);
    }
    public static void main(String[] args){
        myMethod("Tarun", 19);
        myMethod("Khushi", 9);
        myMethod("Santoshi", 53);
    }
}