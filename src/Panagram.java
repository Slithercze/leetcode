import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Panagram {
    public static void main(String[] args) {
        System.out.println(panagram("The quick brown fox jumps over the lazy do"));
//        System.out.println(panagram("Bawds jog, flick quartz, vex nymphs"));
//        System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));
//        System.out.println(isPangram("Bawds jog, flick quartz, vex nymphs"));
    }
    public static boolean panagram(String text){
        text = text.toLowerCase().replaceAll("[^a-zA-Z]","");
        if (text.length() < 26){
            return false;
        }
        List<Character> characters = new ArrayList<>();
        for(char c : text.toCharArray()){
            characters.add(c);
        }

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        List<Character> alph = new ArrayList<>();
        for (char c : alphabet.toCharArray()){
            alph.add(c);
        }

        return characters.containsAll(alph);
    }
    public static boolean isPangram(String text) {
        text = text.toLowerCase();
        text = text.replaceAll("[^a-z]", ""); // Keep only alphabetic characters
        if (text.length() < 26) {
            return false;
        }

        Set<Character> characters = new HashSet<>();
        for (char c : text.toCharArray()) {
            characters.add(c);
        }

        return characters.size() == 26;
    }
}
