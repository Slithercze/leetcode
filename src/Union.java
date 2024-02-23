import java.util.*;

public class Union {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(uni(new int[][]{{1, 2}, {7, 15, -145, 9}, {18, 15, 99, 9, 20}})));
        System.out.println(Arrays.toString(union(new int[][]{{1, 2}, {7, 15, -145, 9}, {18, 15, 99, 9, 20}})));
    }
    public static int[] uni(int[][] arr){
      Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                map.put(arr[i][j], 1);
            }
        }
        int[] result = new int[map.size()];
        int index = 0;
        for(int n : map.keySet()){
            result[index] = n;
            index++;
        }

        return result;
    }

    public static int[] union(int[][] arr){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(!result.contains(arr[i][j])){
                    result.add(arr[i][j]);
                }
            }
        }
        int[] vysledek = new int[result.size()];
        for (int i = 0; i < vysledek.length; i++) {
            vysledek[i] = result.get(i);
        }
        return vysledek;
    }
}
