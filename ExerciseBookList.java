import java.util.ArrayList;
import java.util.List;

public class ExerciseBookList {

    public static void main(String[] args) {

        int[] stk = {}; // 길이가 0인 배열 선언
        int[] arr = { 1, 4, 2, 5, 3 };

        List<Integer> list = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (list.size() == 0) {
                list.add(arr[i]);
                i += 1;
            } else if (list.size() > 0 && list.get(list.size() - 1) < arr[i]) {
                list.add(arr[i]);
                i += 1;
            } else if (list.size() > 0 && list.get(list.size() - 1) >= arr[i]) {
                list.remove(list.size() - 1);
            }
        }

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

    }

}
