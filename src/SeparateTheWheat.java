import java.util.Arrays;

public class SeparateTheWheat {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(wheatFromChaff(new long[]{2, -4, 6, -6})));
        System.out.println(Arrays.toString(wheatFromChaff(new long[]{2, -6, -4, 1, -8, -2}))); //long[] { -2, -6, -4, -8, 1, 2 },
        System.out.println(Arrays.toString(wheatFromChaff(new long[]{8, 10, -6, -7, 9}))); //long[] { -7, -6, 10, 8, 9 },
        System.out.println(Arrays.toString(wheatFromChaff(new long[]{-46, -50, -28, -45, -27, -40, 10, 35, 34, 47, -46, -24}))); // long[] { -46, -50, -28, -45, -27, -40, -24, -46, 34, 47, 35, 10 },
    }

    public static long[] wheatFromChaff(long[] values) {
        int i = 0;
        int j = values.length - 1;

        while (i < j) {
            while (i < j && values[i] < 0) {
                i++;
            }

            while (i < j && values[j] > 0) {
                j--;
            }

            if (i < j) {
                long temp = values[i];
                values[i] = values[j];
                values[j] = temp;
            }
        }

        return values;
    }





}
