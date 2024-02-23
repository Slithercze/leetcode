import java.util.Arrays;

public class DownwardRotation {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(rotate(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}, 2)));
        System.out.println(Arrays.deepToString(rotate(new int[][]{{1, 2, 3}, {5, 6, 7}, {9, 10, 11}}, 1)));
    }
    public static int[][] rotate(int[][] arr, int n){
        for (int i = 0; i < n; i++) {
            int temp = arr[arr.length-1][n];
            for (int j = 0; j < arr.length-1; j++) {
                arr[arr.length-1-j][n] = arr[arr.length-2-j][n];
            }
            arr[0][n] = temp;
        }
        return arr;
    }
}
