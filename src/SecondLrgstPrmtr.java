import java.util.Arrays;

public class SecondLrgstPrmtr {
    public static void main(String[] args) {
        System.out.println(secondLargetPerimeter(new int[][]{{2, 3, 4}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}));
        System.out.println(secondLargetPerimeter(new int[][]{{2, 3, 4}, {4, 5, 6}}));
        System.out.println(secondLargetPerimeter(new int[][]{}));
    }
    public static int secondLargetPerimeter(int[][] triangles){
        if(triangles.length == 0){
            return -1;
        }
        int[] results = new int[triangles.length];
        for (int i = 0; i < triangles.length; i++) {
            results[i] = triangles[i][0] +  triangles[i][1] +  triangles[i][2];
        }
        int[] sortedResult = Arrays.copyOf(results, results.length);
        Arrays.sort(results);
        int max = 0;
        for (int a : results){
            max = Math.max(a,max);
        }

        int second = 0;
        for (int i = results.length - 1; i > 0 ; i--) {
            if (results[i] < max){
                second = results[i];
                break;
            }
        }
        int index = 0;
        for (int i = 0; i < sortedResult.length; i++) {
            if(sortedResult[i] == second){
               index = i;
            }
        }
        return index;
    }
}
