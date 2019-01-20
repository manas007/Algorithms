package leetcode;


/*Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
Example 1:
Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]*/



public class SortedArraySquare {

    public static int[] sortedSquares(int[] A) {

        int[] result = new int[A.length];
        int left = 0, right = A.length-1, index=A.length-1;
        while(left <= right){
            if(Math.abs(A[right]) > Math.abs(A[left])){
                result[index--] = A[right] * A[right];
                right--;
            } else {
                result[index--] = A[left] * A[left];
                left++;
            }
        }
        return result;
    }

    public static void main(String [] args){
        int[] test = {-4,-1,0,3,10};
        test = sortedSquares(test);
        for(int i: test){
            System.out.println(i);
        }
    }
}
