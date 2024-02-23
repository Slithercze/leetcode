import java.util.Arrays;

class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }

        public static boolean jeAnagram(String s, String t) {
            int[] alphabet = new int[26];
            for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
            for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
            for (int i : alphabet) if (i != 0) return false;
            return true;
        }


    public static void main(String[] args) {
        System.out.println(isAnagram("asd", "das"));
        System.out.println(isAnagram("čus","suč"));
    }
}
