import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(transpose(new int[][]{{1, 2, 3}, {4, 5, 6}})));
    }
    public static int[][] transpose(int[][] arr){
        int[][] result = new int[arr[0].length][arr.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = arr[j][i];
            }
        }
        return result;
    }
}
