public class TrckAvg {
    public static void main(String[] args) {
        System.out.println(trickyAvg(new int[]{5,2,8,-1}));
    }
    public static double trickyAvg(int[] arr){
        double max = arr[0];
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0 && arr[i] > max){
                max = arr[i];
            }
          else {
                min = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
        return (max + min) / 2;
    }
}
