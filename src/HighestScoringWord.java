import java.util.*;

public class HighestScoringWord {
    public static void main(String[] args) {
        System.out.println(high("man i need a taxi up to ubud"));
        System.out.println(high("aa b"));
        System.out.println(high("b aa"));
    }

    public static String high(String s) {
        String[] words = s.split("[^a-zA-Z]+");
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Map<String, Integer> map = new HashMap<>();
        int maxMap = 0;
        for (int i = 0; i < words.length; i++) {
            int sum = 0;
            for (int j = 0; j < words[i].length(); j++) {
                sum += alphabet.indexOf(words[i].charAt(j)) + 1;
            }
            if (sum > maxMap) {
                maxMap = sum;
                map.put(words[i], sum);
            }
        }
        int max = 0;

        for (String w : map.keySet()) {
            Integer value = map.get(w);
            if (value > max) {
                max = value;
            }
        }
        for (String w : map.keySet()) {
            Integer value = map.get(w);
            if (value == max) {
                return w;
            }
        }
        return "";
    }
}