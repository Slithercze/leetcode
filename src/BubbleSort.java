import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,5,3,10,8,7};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    public static int[] bubbleSort(int[] input){
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length-i-1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
        return input;
    }
    public static int[] bubbleSort2(int[] input){
        int n = input.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {
                if(input[j-1] > input[j]){
                    //swap elements
                    temp = input[j-1];
                    input[j-1] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }
}
