public class CalculateStringRotation {
    public static void main(String[] args) {
        System.out.println(shiftedDiff("hoop","pooh"));
        System.out.println(shiftedDiff("coffee", "eecoff"));
        System.out.println(shiftedDiff("eecoff","coffee"));
        System.out.println(shiftedDiff("isn't", "'tisn"));
    }

    static int shiftedDiff(String first, String second) {


        int steps = 0;

        while (!first.equals(second)) {
            char[] word = second.toCharArray();
            char temp = word[0];
            for (int i = 0; i < second.length() - 1; i++) {
                word[i] = word[i + 1];
            }
            word[word.length - 1] = temp;
            second = new String(word);
            steps++;
            if(steps > word.length){
                return -1;
            }
        }

        return steps;
    }

}
