package sorting;

import java.util.Random;

public class SelectionSort implements Comparable<SelectionSort> {
    public int[] arrayToSort = new int[30];
    public static Random random = new Random();

    public static void main (String[] args){
        System.out.println("------------------------------------------------");
        System.out.println("Beginning program. generating the array to be sorted");
        System.out.println("-------------------------------------------------");
        SelectionSort testObj = new SelectionSort();

        for(int i=0; i<testObj.arrayToSort.length; i++){
            testObj.arrayToSort[i] = generateRandomNumber();
        }
        testObj.selectionSort(testObj.arrayToSort);

        for(int i : testObj.arrayToSort){
            System.out.println(i);
        }
    }

    public void selectionSort(int[] arrayToSort){
        for(int i = 0; i<arrayToSort.length; i++){
            int min = i;
            for(int j = i+1; j<arrayToSort.length; j++){
                if(arrayToSort[j] < arrayToSort[min]){
                    min = j;
                }
            }
            int temp = arrayToSort[i];
            arrayToSort[i] = arrayToSort[min];
            arrayToSort[min] = temp;
        }
    }

    public static int generateRandomNumber(){
        return random.nextInt(2000) + 1;
    }

    public int compareTo(SelectionSort o){
        return this.compareTo(o);
    }

}