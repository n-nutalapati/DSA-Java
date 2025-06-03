public class Main {
    public static void main(String[] args) {

    }

    // count the number of digits
    static int noOfDigits(int num){
        if(num < 0) num = num * -1;
        return (int)Math.log10(num)+1;
    }

    // Better way to find mid
    static int mid(int start, int end){
        int mid = start + (end - start)/2;
        return mid;
    }
}