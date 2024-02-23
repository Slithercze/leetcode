import java.util.Arrays;

public class FoldArray {


    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(foldArray(input, 3)));
        System.out.println(Arrays.toString(foldArray(new int[]{-9, 9, -8, 8, 66, 23}, 1)));

    }

    public static int[] foldArray(int[] array, int runs) {
        int[] b = Arrays.copyOf(array, array.length);
        for (int i = 0; i < runs; i++) {

            int[] nextArr = new int[(int) Math.round((double) b.length / 2)];
            for (int j = 0; j < nextArr.length; j++) {
                if (j == nextArr.length - 1 && nextArr.length > 1 && b.length % 2 != 0) {
                    nextArr[j] = b[b.length - j - 1];
                } else
                    nextArr[j] = b[j] + b[b.length - j - 1];
            }
            b = Arrays.copyOf(nextArr, nextArr.length);
        }
        return b;
    }

}
