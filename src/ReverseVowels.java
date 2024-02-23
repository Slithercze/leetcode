import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowels {
        public static String reverseVowels(String s) {
            List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
            List<Character> vowels2 = List.of('A','E','I','O','U');
            List<Character> res = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < vowels.size(); j++) {
                    if(s.charAt(i) == vowels.get(j) || s.charAt(i) == vowels2.get(j)){
                        res.add(s.charAt(i));
                        break;
                    }
                }
            }
            char[] result = s.toCharArray();
            int k = 0;
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < res.size(); j++) {
                    if (s.charAt(i) == res.get(j)){
                        result[i] = res.get(res.size() - 1 - k );
                        k++;
                        break;
                    }
                }
            }
            return new String(result);
        }
    public static void main(String[] args) {
        System.out.println(reverseVowels("aA"));
    }

}
