import java.util.Arrays;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] + nums[i] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }

        }
    return null;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
    }
}