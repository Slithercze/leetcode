import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringArrayDuplicates {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dup(new String[]{"css", "piccaninny", "hubbubbubboo"})));
    }

        public static String[] dup(String[] arr){
            String[] result = new String[arr.length];

            for(int i = 0; i < arr.length; i++){
                String temp = String.valueOf(arr[i].charAt(0));
                for(int j = 1; j < arr[i].length(); j++){
                   if(arr[i].charAt(j) != arr[i].charAt(j-1)){
                       temp+=arr[i].charAt(j);
                   }

                }
                result[i] = temp;

            }
        return result;
    }
}
