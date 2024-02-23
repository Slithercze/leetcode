import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class createWordTrngl {
    public static void main(String[] args) {
        System.out.println((triangle("pizza", 3)));
        System.out.println((rectangle("pizza", 3)));
        System.out.println(2>2);
    }
    public static List<List<String>>  triangle(String word, int width){
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < width; i++) {
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < i+1; j++) {
                temp.add(word);
            }
            result.add(temp);
        }

        return result;
    }

    public static List<String> rectangle(String word, int width){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < (int) Math.ceil((double) word.length() / width); i++) {
            result.add(word.substring(i * width,Math.min(i * width + width, word.length())));
        }
        return result;
    }
}
