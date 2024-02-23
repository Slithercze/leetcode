import java.util.Arrays;

public class Censor {
    public static void main(String[] args) {
     //   System.out.println(censor("I ate some apple", "apple", "banana"));
        System.out.println(censor("I ate some apple, orange and I finished with apple again.", "apple", "banana"));
    }
    public static String censor(String text, String originalWord, String newWord){
        String[] result =  text.split("(?<=\\s|,|\\.)|(?=\\s|,|\\.)");
        System.out.println(Arrays.toString(result));
        for (int i = 0; i < result.length; i++) {
            if(result[i].equals(originalWord)){
                result[i] = newWord;
            }
        }

        return String.join("", result);
    }
}
