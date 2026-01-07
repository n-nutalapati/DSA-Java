package coding.binarysearch;

public class BinarySearchQnos {

    public static void main(String[] args) {
//        int[] arr = {2,3,5,9,14,16,18};
//        int target = 15;
//
//        int ans = ceilingOfaNumber(arr, target);
//        System.out.println(ans);

//        char[] ch = {'c','f','j'};
//        char target = 'c';
//
//        System.out.println(nextGreatestLetter(ch, target));
        char ch1 = 'B';
        char ch2 = 'b';

        if(ch1 > ch2)
            System.out.println(ch1+" is greater than "+ ch2);
        else if (ch1 < ch2)
            System.out.println(ch1+" is less than "+ ch2);
        else
            System.out.println("Both are equal");
    }



    public static int ceilingOfaNumber(int[] arr, int target){
//        find the ceil of a number in an array
//        arr = [2,3,5,9,14,16,18], target = 14
//        ceiling = smallest element in an array greater or = target
//        ceiling(arr, target=14) = 14
//        ceiling(arr, target = 15) = 16
//        target = 4 then ans = 5
//        target = 9 then ans = 9

//        what if the target is greater than the greatest number in the array
        if(target > arr[arr.length] - 1){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while( start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return  mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int floorOfaNumber(int[] arr, int target){
//        similar question as above. find the floor of a number
//        arr = [2,3,5,9,14,16,18], target = 15
//        floor = greatest element in an array smaller or = target
//        ceiling(arr, target=15) = 14

        int start = 0;
        int end = arr.length - 1;

        while( start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return  mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

//    https://leetcode.com/problems/find-smallest-letter-greater-than-target/

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target < letters[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return letters[start % letters.length];
    }

//    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

}
