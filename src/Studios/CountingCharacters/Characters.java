package Studios.CountingCharacters;
import java.util.HashMap;
import java.util.Scanner;
public class Characters {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";


        HashMap<Character, Integer> chars = new HashMap<>();
        Scanner input = new Scanner(System.in);
        char[] charactersInString = quote.toCharArray();
        Character letter;
        Integer charCount = 0;
        for (Integer i = 0; i < charactersInString.length; i++) {

            Integer addOne = 1;
            letter = charactersInString[i];

            if (!chars.containsKey(letter)) {
                charCount += 1;


            } else if (chars.containsKey(letter)) {
                charCount += addOne;

            }
            System.out.println(charCount);
        }
    }
}