import java.util.ArrayList;
import java.util.List;

public class TheBirthdayProblem {
    public static void main(String[] args) {
        System.out.println(birthday(new ArrayList<>(List.of(1, 1, 1, 1, 1, 1)), 3, 2));
     System.out.println(birthday(new ArrayList<>(List.of(1,2,1,3,2)), 3, 2));
        System.out.println(birthday(new ArrayList<>(List.of(4)), 4, 1));
    }
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int result = 0;
        for(int i = 0; i < s.size();i++){
            int temp = s.get(i);
            for(int j = i+1,k = 1; k < m ; j++,k++){
                if(j<s.size()){
                temp+=s.get(j);
            }}
            if(temp == d){
                result++;
            }
        }
        return result;
    }
}
