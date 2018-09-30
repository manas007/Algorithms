package Sorting;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    public static Random random  = new Random();
    public static int arraySize = 28;
    public static int[] arrayToSearch = new int[arraySize];
    public static int rangeMin = 20;
    public static int rangeMax = 2000;

    public static void main(String[] args){
        populateDataInArray();
        Arrays.sort(arrayToSearch);
        for(int i: arrayToSearch){
            System.out.println(i);
        }
    }

    public static void populateDataInArray(){
        for(int i=0; i<arrayToSearch.length; i++){
            arrayToSearch[i] = generateARandomNumberBetweenSpecificRange();
        }
    }

    public static int generateARandomNumberBetweenSpecificRange(){
        return random.nextInt(rangeMax-rangeMin + 1) + rangeMin;
    }
}
