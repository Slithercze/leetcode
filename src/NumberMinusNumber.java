public class NumberMinusNumber {
    public static void main(String[] args) {
//        System.out.println(func(new int[]{1, 4, 8, 90, 91}));
//        System.out.println(func(new int[]{3, 6, 12, 1}));
        System.out.println(func(new int[]{1}));
    }

    public static int func(int[] arr) {
//        if(arr.length < 2){
//            return -1;
//        }
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            for (int i = j+1; i < arr.length; i++) {
                int res = Math.abs(arr[i] - arr[j]);
                if (res < min) {
                    min = res;
                }
            }
        }
        return min;
    }
}
