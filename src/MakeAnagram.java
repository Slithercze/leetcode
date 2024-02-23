import java.util.*;

public class MakeAnagram {
    public static int makeAnagram(String a, String b) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : a.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        for (char c : b.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) - 1);
            } else {
                charCount.put(c, -1);
            }
        }

        int totalRemovals = 0;
        for (int count : charCount.values()) {
            totalRemovals += Math.abs(count);
        }

        return totalRemovals;
    }




    public static void main(String[] args) {
        System.out.println(makeAnagram("cde", "abcc")); //checknout duplicitu unikatni znaky
    //    System.out.println(makeAnagram("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
    }
}
