import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int lastIndex = nums.length - 1;
        String l = "";

        for (int i = 0; i <= lastIndex; i++) {
            if (nums[i] == 0) {
                // Shift all elements to the left starting from the current position
                for (int j = i; j < lastIndex; j++) {
                    nums[j] = nums[j + 1];

                }
                nums[lastIndex] = 0;
                lastIndex--; // Reduce the lastIndex to skip the moved zero
                i--; // Revisit the current index since it may now contain a new non-zero element
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

}
