public class LongestCommonPrefix {

    public static String commonLongestPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }


    public static void main(String[] args) {

     //   System.out.println(commonLongestPrefix(new String[]{"flower","flower","flower","flower"}));
        System.out.println(commonLongestPrefix(new String[]{"flower","flow","flight"}));


    }

}
