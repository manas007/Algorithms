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
            int min = i;
            for(int j = i-1; j>=0; j--){
                if(arrayToSort[j] > arrayToSort[min]){
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[min];
                    arrayToSort[min] = temp;
                    min = j;
                }
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
