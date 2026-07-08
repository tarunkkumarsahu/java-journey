public class string{
    public static void main(String [] args){
        String txt = "ABCDEFGHIJKrreLMNOPQgfVdfgZ";
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println("The length of the string is: " + txt.length());
        System.out.println(txt2.indexOf("locate"));
        String txt3 = "   Hello World   ";
        System.out.println("Before: [" + txt3 + "]");
        System.out.println("After:  [" + txt3.trim() + "]");
    }
}

//concatenation

