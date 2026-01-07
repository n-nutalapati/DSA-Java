package coding.binarysearch;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

                int mid = start + (end - start)/2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
//                ans found
                return mid;
            }
        }
        return -1;
    }
}
