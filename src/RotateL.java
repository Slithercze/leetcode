import java.util.ArrayList;
import java.util.List;

public class RotateL {
    public static List<Integer> rotLeft(List<Integer> a, int d) {

        List<Integer> rotated = new ArrayList<>(a.size());

        for (int i = 0; i < a.size(); i++) {
            int newIndex = (i + d) % a.size(); // Calculate the new index after rotation (for left rotation)
            rotated.add(a.get(newIndex));
        }

        return rotated;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
  String a =   ("5 3 1 | 3 1 5 | 1 5 3 | 5 3 1");
        System.out.println(rotLeft(list, 4));
    }
}
