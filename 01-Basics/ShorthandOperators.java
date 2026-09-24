public class ShorthandOperators{
    public static void main(String[] args) {
        int time = 20;
        String message = (time < 12)?"Good Morning."
                        :(time <12)?"Good Afternoon."
                        :"Good Evening.";
        System.out.println(message);
    }
}