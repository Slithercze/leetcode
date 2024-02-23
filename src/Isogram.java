import java.util.HashMap;
import java.util.Map;

public class Isogram {
    /*
    Isogram
Create a function called isogram that takes a string as an input and returns a boolean value whether a string is a isogram or not. Rules are as follows:
the comparison is case-insensitive: "a" DOES EQUAL "A"
the space is not considered as a character (it is ignored)
string has to be at least one character long, otherwise the result is by DEFAULT "false"
Isogram is a word or a phrase in which no letter of the alphabet occurs more than once ("Evan" is isogram, "carrot" is NOT isogram)
Example cases:
isogram("Readily");
Should return "true"
isogram("UNCOPYRIGHTABLE");
Should return "true"
isogram("He is moral");
Should return "true"
     */
    public static void main(String[] args) {
        System.out.println(isogram("He is moral"));
    }
    public static boolean isogram(String word){
        word = word.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < word.length(); i++){
            if(map.containsKey(word.charAt(i))){
                map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
            } else {
                map.put(word.charAt(i), 1);
            }
        }
        for(char c : map.keySet()){
            Integer value = map.get(c);
            if(value > 1){
                return false;
            }
        }
        return true;
    }
}
