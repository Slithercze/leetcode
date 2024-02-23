public class ValidPalindrome {

        public static boolean isPalindrome(String s) {
            if (s.length() == 0) return true;
            s = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
            boolean flag = false;
            for (int i = 0; i < s.length() / 2; i++) {
                flag = s.charAt(i) == s.charAt(s.length() - 1 - i);
                if (!flag){
                    return false;
                }
            }

            return flag;
        }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        String s =    ",; W;:GlG:;l ;,";
         s = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        System.out.println(s);
        System.out.println(isPalindrome(s));

    }
}
