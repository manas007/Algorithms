package searching;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class ThreeSum {

    public static int[] inputArr = new int[1000];
    public static int numberOfCombinations = 0;

    public static void main(String[] args){
        try {
            URL url = new URL("https://algs4.cs.princeton.edu/14analysis/1Kints.txt");
            Scanner s = new Scanner(url.openStream());
            int index = 0;
            while (s.hasNext()){
                inputArr[index] = s.nextInt();
                index++;
            }

        }
        catch (IOException ex){
            System.out.println("Error reading the file from https://algs4.cs.princeton.edu/14analysis/1Kints.txt");
        }

        Arrays.sort(inputArr);

        for(int i = 0; i<inputArr.length - 1; i++){
            for(int j = i+1 ; j<inputArr.length - 1; j++){
                int k = Arrays.binarySearch(inputArr, -(inputArr[i] + inputArr[j])); // return the index of the element which is equal to -(inputArr[i] + inputArr[j])
                if(k > j){
                    numberOfCombinations++;
                    System.out.println("The sum of " +inputArr[i] + " , " + inputArr[j] + " , " + inputArr[k] + " is zero");
                }
            }
        }

        System.out.println("There are, in total, " +numberOfCombinations + " such combinations");

    }

}

