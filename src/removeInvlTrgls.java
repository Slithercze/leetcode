import java.util.Arrays;
public class removeInvlTrgls {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(removeTriangles(new int[][]{{1, 2, 3}, {2,3,4}, {4,5,6}})));
        System.out.println(Arrays.deepToString(removeTriangles(new int[][]{{1, 10,12}, {5,10,7}})));
        System.out.println(Arrays.deepToString(removeTriangles(new int[][]{})));
    }
    public static int[][] removeTriangles(int[][] triangles){
        int size = 0;
        for (int i = 0; i < triangles.length; i++) {
            if (isValid(triangles[i])){
                size++;
            }
        }
        int[][] result = new int[size][];
        for (int i = 0,k = 0; i < triangles.length; i++) {
            if (isValid(triangles[i])){
                result[k] = triangles[i];
                k++;
            }
        }
        return result;
    }
    public static boolean isValid(int[] side){
        return side[0] + side[1] > side[2] && side[1] + side[2] > side[0] && side[0] + side[2] > side[1];
    }
}
