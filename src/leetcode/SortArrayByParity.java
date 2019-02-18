/*Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.

        Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.

        You may return any answer array that satisfies this condition.

        Input: [4,2,5,7]
        Output: [4,5,2,7]
        Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
        */

package leetcode;

public class SortArrayByParity {

    public static void main(String[] args){
        int[] A = {2,1,3,6};
        int[] output = new int[A.length];
        int even = 0;
        int odd = 1;

        for(int i=0; i< A.length; i++){
            if(A[i] % 2 == 0 && even < output.length){
                output[even] = A[i];
                even +=2;
            }

            if(A[i] % 2 != 0 && odd < output.length){
                output[odd] = A[i];
                odd +=2;
            }
        }

        for (int a: output
             ) {
            System.out.println(a);
        }
    }
}
