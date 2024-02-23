import java.util.*;

public class Arandom {
    public static boolean isIsogram(String word){
        Map<Character, Integer> map = new HashMap<>();
        word = word.replaceAll("[^a-zA-Z0-9]","");
        char[] letters = word.toLowerCase().toCharArray();
        for (char c : letters){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else  {
                map.put(c, 1);
            }
        }
        for (Character c : map.keySet()){
            Integer value = map.get(c);
            if(value > 1){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isIsogram("He is moral"));
    }
}
