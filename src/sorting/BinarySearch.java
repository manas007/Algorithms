package sorting;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    public static Random random  = new Random();
    public static int arraySize = 28;  // number of elements you want
    public static int[] arrayToSearch = new int[arraySize];
    public static int rangeMin = 20;
    public static int rangeMax = 2000;
    public static int numberToSearch=generateARandomNumberBetweenSpecificRange(rangeMin, rangeMax);

    public static void main(String[] args){

        System.out.println("-----------------------------------------------------------");
        System.out.println("Populating random data to array");
        System.out.println("-----------------------------------------------------------");

        populateDataInArrayAndSortItForBinarySearch();
        System.out.println("The values in array are : ");
        for(int i: arrayToSearch){
            System.out.println(i);
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("The Number to search is " + numberToSearch);
        boolean result = runBinarySearchAlgo(); // actual method for binary serach implementation.
        System.out.println("-----------------------------------------------------------");
        System.out.println("Was the number found ? Answer : "+ result);
    }

    public static void populateDataInArrayAndSortItForBinarySearch(){
        for(int i=0; i<arrayToSearch.length; i++){
            arrayToSearch[i] = generateARandomNumberBetweenSpecificRange(rangeMin, rangeMax);
        }
        Arrays.sort(arrayToSearch); // mandatory to have a sorted array for binary search

    }

    public static int generateARandomNumberBetweenSpecificRange(int rangeMin, int rangeMax){
        // random.nextInt(bound) will give a random number between 0 (inclusive) and the bound (exclusive)
        // random.nextInt(30) will give any number between [0 .......... 29]
        // so, random.nextInt(30) + 1 will give any number between [1 ...........30]
        return random.nextInt(rangeMax-rangeMin + 1) + rangeMin;
    }

    public static boolean runBinarySearchAlgo(){
        int startIndex=0;
        int lastIndex=arraySize-1;
        // keep dividing the array to half, and update the startIndex and LastIndex of the broken array
        while(lastIndex>startIndex) { // array keeps dividing itself unless there is only 1 element eft, or in other words, startIndex is same as lastIndex of array.
            int middleIndex=(lastIndex + startIndex) / 2;
            if(numberToSearch>arrayToSearch[middleIndex]){
                startIndex=middleIndex+1;
            }
            else{
                lastIndex=middleIndex;
            }
        }
        return numberToSearch == arrayToSearch[lastIndex];
    }
}
