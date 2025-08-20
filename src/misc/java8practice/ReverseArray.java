package misc.java8practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};

        System.out.println(Arrays.toString(IntStream.range(0, arr.length / 2)
                .mapToObj(i -> {
                    int temp = arr[arr.length - i - 1];
                    arr[arr.length - i - 1] = arr[i];
                    arr[i] = temp;
                    return null;
                }).toArray()));
    }
}
