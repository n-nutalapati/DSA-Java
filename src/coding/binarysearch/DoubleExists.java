package coding.binarysearch;

import java.util.HashSet;
import java.util.Set;

public class DoubleExists {
    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{3,1,7,11}));
    }

    public static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int j : arr) {
            int x2times = j * 2;
            int half = j / 2;
            if (set.contains(x2times) || (j % 2 == 0 && set.contains(half))) {
                return true;
            }
            set.add(j);
        }
        return false;
    }
}
