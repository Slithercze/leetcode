class MergeStrings {
    public static void mergeAlternately(String word1, String word2) {
        String res = "";
        int word1Length = word1.length();
        int word2Length = word2.length();
        int i = 0;
        while (i < word1Length || i < word2Length) {
            if(i < word1Length){
                res+=word1.charAt(i);
            }
            if(i < word2Length){
                res+=word2.charAt(i);
            }
            i++;
        }

            System.out.println(res);

    }

    public static void main(String[] args) {
        mergeAlternately("abcd", "pq");
    }
}