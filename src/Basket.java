import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basket {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(basket(new int[]{4,2,7,4,2,3}, 15)));
    }

    public static int[] basket(int[] itemSizes, int limit){
        int sum = 0;
        int i = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (sum < limit){
            sum+=itemSizes[i];
            if (sum > limit ) {
               sum-=itemSizes[i];
            } else {
                arrayList.add(itemSizes[i]);
            }
            i++;
        }
        int[] result = new int[arrayList.size()];
        for (int j = 0; j < result.length; j++) {
            result[j] = arrayList.get(j);
        }
        return result;
    }

    public static int[] basketv2(int[] arr, int limit){
        List<Integer> result = new ArrayList<>();

        int sum = 0;
        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            if(sum+arr[j] <= limit){
                sum+=arr[j];
                result.add(arr[j]);
            }
        }


        int[] pole = new int[result.size()];
        for (int j = 0; j < result.size(); j++) {
            pole[j] = result.get(j);
        }
        return pole;
    }
}
