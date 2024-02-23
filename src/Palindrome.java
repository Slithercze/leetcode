public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("My Gym"));
    }

    public static boolean isPalindrome(String text){
        text = text.toLowerCase().replaceAll("[^a-zA-Z]","");
        for (int i = 0; i < text.length()/2; i++) {
            if(text.charAt(i) != text.charAt(text.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
