import java.util.ArrayList;
import java.util.List;

public class BreakString {
    public static void main(String[] args) {
        System.out.println(duplicateVowels("hello", 3));

    }
        public static String duplicateVowels(String input, int numDuplicates) {
            String result = "";
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == 'a' || input.charAt(i) == 'e' ||input.charAt(i) == 'i' ||input.charAt(i) == 'o' ||input.charAt(i) == 'u'){
                    for (int j = 0; j < numDuplicates; j++) {
                        result+=input.charAt(i);
                    }
                } else {
                    result+=input.charAt(i);
                }
            }

            return result;
        }
}
