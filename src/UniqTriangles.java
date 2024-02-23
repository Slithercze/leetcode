import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqTriangles {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(uniq(new int[][]{{3, 4, 5}, {6, 7, 8}, {4, 3, 5}, {8, 7, 6}})));
        System.out.println(Arrays.deepToString(uniq(new int[][]{})));
    }

    public static int[][] uniq(int[][] triangles) {
        List<int[]> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0, k = 0; i < triangles.length; i++) {
            if (!list.contains(calculateSum(triangles[i]))) {
                list.add(calculateSum(triangles[i]));
                result.add(triangles[i]);

            }
        }
        int k = 0;
        int[][] res2 = new int[result.size()][];
        for (int[] n : result) {
            res2[k] = n;
            k++;
        }
        return res2;
    }

    public static int calculateSum(int[] obvod) {
        return obvod[0] + obvod[1] + obvod[2];
    }
}
