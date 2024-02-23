public class RailFence {
    public static void main(String[] args) {
        System.out.println(zigzag("helloworld"));
    }
    public static String zigzag(String word){
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if(i % 2 == 0){
                result+=word.charAt(i);
            }
        }
        for (int i = 0; i < word.length(); i++) {
            if(i % 2 != 0){
                result+=word.charAt(i);
            }
        }
        return result;
    }
}
