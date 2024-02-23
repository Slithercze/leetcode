import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PyramidSrt {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pyramid(new int[]{1, 2, 3, 4, 5, 6, 7})));
    }
    public static int[] pyramid(int[] arr){
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                odd.add(arr[i]);
            }
            else {
                even.add(arr[i]);
            }
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < odd.size(); i++) {
            result[i] = odd.get(i);
        }
        for (int i = 0; i < even.size(); i++) {
            result[result.length - 1 - i] = even.get(i);
        }
        return result;
    }
}
