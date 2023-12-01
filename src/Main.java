public class Main {
    public static void main(String[] args) {
        String text = "sdsdv1sgsg9";
        int fist;
        int last;

        for(int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
            if (IsInteger(i))
        }


    }

    public static boolean IsInteger(String input){
        try
        {
            Integer.parseInt(input);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }
}