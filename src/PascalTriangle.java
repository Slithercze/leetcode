import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generate(4)));
        System.out.println(Arrays.toString(generate(1)));
        System.out.println(Arrays.toString(generate(2)));
        System.out.println(Arrays.toString(generate(0)));
    }
        public static long[] generate(int level) {
        if(level == 1){
            return new long[]{1};
        }
        if(level == 2){
            return new long[]{1,1};
        }
            long[][] pyramid = new long[level][];
            pyramid[0] = new long[]{1};
            pyramid[1] = new long[]{1,1,1};


            for(int i = 2; i < level; i++){
                long[] temp = new long[i+1];
                temp[0] = 1;
                temp[temp.length - 1] = 1;
                for (int j = 1; j < pyramid[i-1].length; j++) {
                    temp[j] = pyramid[i-1][j-1] + pyramid[i-1][j];
                }
                pyramid[i] = temp;
            }

            List<Long> list = new ArrayList<>();
            for (int i = 0; i < pyramid.length; i++) {
                for (int j = 0; j < pyramid[i].length; j++) {
                    list.add(pyramid[i][j]);
                }
            }
            int index = 0;
            long[] result = new long[list.size()];
            for(long n : list){
                result[index] = n;
                index++;
            }
            return result;
        }
}
/* <2054455634L>, <450978066L>, <85900584L>, <13983816L>, <1906884L>, <211876L>, <18424L>, <1176L>, <49L>, <1L>]
  <2054455634L>, <450978066L   <85900584L>, <13983816L>, <1906884L>, <211876L>, <18424L>, <1176L>, <49L>, <1L>
 */
