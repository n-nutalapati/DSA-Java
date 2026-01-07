package coding.dynamicprogramming;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(nthFibonacciNumber(6));
        System.out.println(nthFibonacciNumber(7));
        System.out.println(nthFibonacciNumber(8));
        System.out.println(nthFibonacciNumber(50));
    }

    public static long nthFibonacciNumber(long n){
        if(n <= 2) return 1;
        return nthFibonacciNumber(n-1)+nthFibonacciNumber(n-2);
    }
}
