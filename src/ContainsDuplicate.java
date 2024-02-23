import java.util.ArrayList;
import java.util.List;

class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        List<Integer> integers = new ArrayList<>();
        for (int num : nums) {
            if (integers.contains(num)){
                return true;
            }
            integers.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));

    }
}