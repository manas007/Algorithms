package leetcode;

import java.util.*;

public class ArrayHopper {


    public static String arrayHoppersol(int[] inputarr){

        int[] hopArray = new int[inputarr.length];
        Map<Integer, ArrayList<Integer>> legalHopMap = new HashMap<>();
        for(int i=0; i<inputarr.length; i++)
        {
            ArrayList<Integer> indices = new ArrayList<>();
            if(inputarr[i]>0){
                hopArray[i] = i + inputarr[i];

                if(hopArray[i] > inputarr.length - 1) {hopArray[i] = inputarr.length ;}
                //System.out.println("index " + i + " has value " + inputarr[i]);
                //System.out.println("index " +  i + " is allowed to hop from " + (i+1) + " to " + hopArray[i]);


                for(int j = i+1; j<= hopArray[i] && j<inputarr.length && hopArray[i] >0; j++){
                    if(inputarr[j] != 0){
                        indices.add(j);
                        //System.out.println("added " + j +  " for index " + i);
                    }

                }

                if(inputarr[i] + i >= inputarr.length ){
                    indices.add(inputarr.length);
                    //System.out.println("Finally added " + (inputarr.length) +  " for index " + i); // if i add an index equal to length, I am out :)
                }
                if(indices.size()>0) {
                    legalHopMap.put(i, indices);
                }
            }
        }

        Set<Integer> path= new HashSet<>();
        int firstKeyFromMap = (int) legalHopMap.keySet().toArray()[0];
        path.add(firstKeyFromMap);


        for(int key : legalHopMap.keySet()){
            ArrayList<Integer> eachList = legalHopMap.get(key);

            if(eachList.size() == 1){
                path.add(eachList.get(0));
            }
            else {
                path.add(Collections.max(eachList));
            }
        }

        if(Collections.max(path) >= inputarr.length){
            String output = "";
            for (int a: path) {
                if(a == inputarr.length){
                    continue;
                }
                else {
                    output = output + String.valueOf(a) + ",";
                }
            }
            output = output + "out";
            return output;
        }
        else {
            return new String("failure");
        }

    }


    public static void main(String[] args){

        int[] test = {1,6,6,9};
        String result = arrayHoppersol(test);
        System.out.println(result);
    }
}
