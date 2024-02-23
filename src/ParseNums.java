import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParseNums {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(parseNumbers("1-3,5,7-10,13")));
        System.out.println(Arrays.toString(parseNumbers("")));
    }
    public static int[] parseNumbers(String text){
        if(text.isEmpty()){
            return new int[]{};
        }
        String[] words = text.split(",");
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(words[i].contains("-")){
                int start = Integer.parseInt(words[i].substring(0,words[i].indexOf('-')));
                int end = Integer.parseInt(words[i].substring(words[i].indexOf('-') + 1));
                for (int j = start; j <= end; j++) {
                    integers.add(j);
                }
            } else {
                integers.add(Integer.valueOf(words[i]));
            }
        }
        int[] result = new int[integers.size()];
        int index = 0;
        for (int n : integers){
            result[index] = n;
            index++;
        }
        return result;
    }
}
