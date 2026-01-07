package coding.binarysearch;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println(Arrays.toString(searchInSorted(arr, 11)));
    }
    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c =matrix.length-1;

        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r, c};
            }
            if(matrix[r][c] < target){
                r++;
            } else c--;
        }

        return new int[]{-1,-1};
    }

    static int[] searchInSorted(int[][] matrix, int target){
        int row = matrix.length-1;
        int col = matrix[row].length-1;

        while(row >= 0 && col >= 0){

            if(matrix[row][col]==target)
                return new int[]{row, col};
            else if(matrix[row][col]>target)
                col--;
            else if(matrix[row][col]<target)
                row++;
        }
        return new int[]{-1,-1};
    }
}
