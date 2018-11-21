package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MorseCode {
    public static List<Integer> evenList = new ArrayList<>();
    public static List<Integer> oddList = new ArrayList<>();

    public static void main(String[] args) {
        int[] testArray = {3, 1, 2, 4};
        System.out.println("Input Array Integers");
        for (int a : testArray
        ) {
            System.out.println(a);
        }
        int[] finalO = sortArrayByParity(testArray);
        System.out.println(" ----------------- Output Array Integers ------------------");
        for (int a : finalO
        ) {
            System.out.println(a);
        }

    }

    public static int[] sortArrayByParity(int[] A) {
        if (A.length == 0) {
            return new int[]{};
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                evenList.add(A[i]);
            } else {
                oddList.add(A[i]);
            }
        }
        evenList.addAll(oddList);
        int[] outputArray = new int[evenList.size()];
        int i = 0;
        for (int output : evenList) {
            outputArray[i] = output;
            i++;
        }
        return outputArray;
    }

}
