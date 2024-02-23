import java.util.*;

public class DiffFinder {
    public static void main(String[] args) {
findDiff(new int[]{1,2,3,4}, new int[]  {3,4,5,6,7,8});
        uniq(new int[]{1,2,3,4}, new int[]  {3,4,5,6,7,8});
    }
    public static void uniq(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        // Add all elements from arr1 to the set
        for (int a : arr1) {
            set.add(a);
        }

        // Modify the set based on arr2
        for (int a : arr2) {
            if (set.contains(a)) {
                set.remove(a);
            } else {
                set.add(a);
            }
        }

        List<Integer> resultList = new ArrayList<>(set);
        Collections.sort(resultList); // Sort the list if needed
        System.out.println(resultList);
    }


    public static void findDiff(int[] arr1, int[] arr2){
        Map<Integer, Integer> map = new HashMap<>();

        for(int x : arr1){
                map.put(x, 1);
        }
        for(int x : arr2){
            if(map.containsKey(x)){
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        int size = 0;
        for(int x : map.keySet()){
            int value = map.get(x);
            if(value == 1){
                size++;
            }
        }

        int[] result = new int[size];
        int i= 0;
        for(int x : map.keySet()){
            int value = map.get(x);
            if(value == 1){
                result[i] = x;
                i++;
            }

        }
        System.out.println(Arrays.toString(result));
    }
}
