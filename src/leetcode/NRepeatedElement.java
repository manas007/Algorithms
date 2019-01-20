package leetcode;

/*In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
Return the element repeated N times.
Example 1:
Input: [1,2,3,3]
Output: 3
*/

public class NRepeatedElement {

    public static int repeatedNTimes(int[] A) {
        int startAt = A.length-2;
        int valFound = -1;
        int fixedValue = A[A.length-1];
        int count = A.length-1;

        while(startAt >= 0)
        {

            if(A[startAt] != fixedValue){

                startAt--;
                if(startAt == -1)
                {
                    fixedValue = A[--count];

                    startAt = count - 1;

                }
                continue;
            }
            else {
                valFound = fixedValue;
                break;
            }
        }

        return valFound;
    }

    public static void main(String [] args){
        int[] test = {1,6,6,9};
        int s = repeatedNTimes(test);
        System.out.println(s);
    }

}
