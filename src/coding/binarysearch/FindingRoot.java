package coding.binarysearch;

public class FindingRoot {
    public static void main(String[] args) {
        System.out.println(3%2);
        System.out.println(squareRoot(16));

    }

    static double squareRoot(double num){
        double left = 1;
        double right = num;
        double mid = (left + right) / 2;

        while(left <= right){

            mid = (left + right) / 2;

            if(mid * mid == num)
                return mid;
            else if (mid * mid < num){
                left = mid+1;
            } else
                right = mid-1;
        }
//        return Math.round(right);
        return right;
    }
}
