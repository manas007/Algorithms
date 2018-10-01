package sorting;

import java.util.Random;

public class BubbleSort {
    public static int arraySize = 30;
    public static int[] arrayToSort = new int[arraySize];
    public static Random random = new Random();


    public static void main(String[] args){
        populateArrayWithRandomData();

        System.out.println("------------------------------------------------");
        System.out.println("Populated array with random data");
        for(int i: arrayToSort){
            System.out.println(i);
        }
        System.out.println("------------------------------------------------");
        bubbleSort();

        System.out.println("------------------------------------------------");
        for(int i: arrayToSort){
            System.out.println(i);
        }
        System.out.println("------------------------------------------------");

    }

    public static void populateArrayWithRandomData(){
        for(int i=0; i< arraySize; i++){
            arrayToSort[i]=generateRandomIntegers();
        }
    }

    public static int generateRandomIntegers(){
        return random.nextInt(700) + 1 ;
    }
    public static void bubbleSort(){
        for (int i=0; i<arraySize; i++){  // 0 to 29
            for(int j=0; j<arraySize-i-1; j++){  // 0 to 28
                if(arrayToSort[j]>arrayToSort[j+1]){
                    int temp = arrayToSort[j+1];
                    arrayToSort[j+1] = arrayToSort[j];
                    arrayToSort[j]=temp;
                }
            }
        }
    }

}
