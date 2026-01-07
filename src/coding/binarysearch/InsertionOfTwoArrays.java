package coding.binarysearch;

import java.util.*;

abstract class Writer {
    public static void write(){
        System.out.println("Writing...");
    }
}
class Author extends Writer{
    public static void write(){
        System.out.println("Writing book");
    }
}

class Programmer extends Writer{
    public static void write(){
        System.out.println("Writing code");
    }

    public static void main(String[] args) {
        Writer w = new Programmer();
        Writer.write();
    }
}

public class InsertionOfTwoArrays {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4})));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        List<Integer> arr = new ArrayList<>();

        for (int j : nums1) {
            set1.add(j);
        }

        for(int num: nums2){
            if(set1.contains(num)){
                arr.add(num);
                set1.remove(num);
            }
        }

        int[] num = new int[arr.size()];

        for(int i = 0 ; i<arr.size(); i++){
            num[i] = arr.get(i);
        }

        return num;
    }

    public class Test{
        public static void main(String[] args) {
            int x = 10;
            int y = 2;

            try{
                for(int z=2; z>=0; z--){
                    int ans = x/z;
                    System.out.println(ans+" ");
                }
            }catch (Exception e1){
                System.out.println(e1);
            }
        }
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        List<Integer> arr = new ArrayList<>();

        for(int num: nums1){
            map1.put(num, map1.getOrDefault(num,0)+1);
        }

        for(int num: nums2){
            if(map1.getOrDefault(num,0) > 0){
                arr.add(num);
                map1.put(num, map1.get(num)-1);
            }
        }

        int[] num = new int[arr.size()];

        for(int i = 0 ; i<arr.size(); i++){
            num[i] = arr.get(i);
        }

        return num;
    }
}
