package sorting;

import java.util.Random;

public class InsertionSort implements Comparable<InsertionSort> {
    public int[] arrayToSort = new int[30];
    public static Random random = new Random();

    public static void main (String[] args){
        System.out.println("------------------------------------------------");
        System.out.println("Beginning program. generating the array to be sorted");
        System.out.println("-------------------------------------------------");
        InsertionSort testObj = new InsertionSort();

        for(int i=0; i<testObj.arrayToSort.length; i++){
            testObj.arrayToSort[i] = generateRandomNumber();
        }
        testObj.insertionSort(testObj.arrayToSort);

        for(int i : testObj.arrayToSort){
            System.out.println(i);
        }
    }

    public void insertionSort(int[] arrayToSort){
        for(int i = 1; i<arrayToSort.length; i++){
            for(int j = i; j>0 && arrayToSort[j] < arrayToSort[j-1]; j--){
                    int temp = arrayToSort[j-1];
                    arrayToSort[j-1] = arrayToSort[j];
                    arrayToSort[j] = temp;
                }
            }
        }

    public static int generateRandomNumber(){
        return random.nextInt(2000) + 1;
    }

    public int compareTo(InsertionSort o){
        return this.compareTo(o);
    }

}
