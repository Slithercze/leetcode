import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

class Maps {
    public static String frequency(String s) {
        Map<String, Integer> map = new HashMap<>();
        String[] arr = s.toLowerCase().split("[^a-zA-Z]+");
        for (String words : arr) {
            if(map.containsKey(words)){
                map.put(words,map.get(words) + 1);
            } else {
                map.put(words, 1);
            }
        }
        int max = 0;
        for (String word : map.keySet()) {
            int value = map.get(word);

            if(value > max){
                max= value;
            }
        }
        String foundKey = "";
        for (String word : map.keySet()) {
            int value = map.get(word);
            if (value == max) {
                foundKey = word;
                break; // Exit the loop once the key is found
            }
        }
        System.out.println(foundKey);


        return foundKey;
    }

    public static void main(String[] args) {
        String k = "Bob hit a ball, the hit BALL flew far after it was hit.";
        System.out.println(frequency(k));
        System.out.println("hello".toCharArray());
        String hey = "hello";
        char[] list = hey.toCharArray();
        System.out.println(Arrays.toString(list));

    }
}