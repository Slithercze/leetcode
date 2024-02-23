public class ReverseString {
    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2 ; i++) {
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
    }
    public static String reverse(String s){
        String solution = "";
        for (int i = 0; i < s.length(); i++) {
            solution = s.charAt(i) + solution;
        }
        return solution;
    }

    public static void main(String[] args) {
        System.out.println(reverse("ahoj"));
        char[] x = "ahoj".toCharArray();
        reverseString(x);
        System.out.println(x);
    }
}
