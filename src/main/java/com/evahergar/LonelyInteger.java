package com.evahergar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LonelyInteger {
    // Complete the findLonely function below.
    static int findLonely(List<Integer> arr) {
        ArrayList<Integer> stack = new ArrayList<>();
        for(int number : arr){
            if(stack.contains(number)){
                stack.remove(stack.indexOf(number));
            }else{
                stack.add(number);
            }
        }

        if(stack.size() == 1){
            return stack.get(0);
        }else {
            return -1;
        }
    }

    /***
     * Consider an array of integers where all but one of the integers occur in pairs.
     * In other words, every element occurs exactly twice except for one unique element.
     * Find the unique element.
     *
     * For example, given the array {1, 1, 2, 2, 3} , you would return 3.
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>(Arrays.asList(1, 1, 2));
        System.out.println("For list: " + testList.toString());
        System.out.println(findLonely(testList));

        testList = new ArrayList<>(Arrays.asList(0 ,0, 1, 2, 3,4 , 3, 2, 1));
        System.out.println("For list: " + testList.toString());
        System.out.println(findLonely(testList));

        testList = new ArrayList<>(Arrays.asList(4, 9, 95, 93, 57, 4, 57, 93, 9));
        System.out.println("For list: " + testList.toString());
        System.out.println(findLonely(testList));
    }
}
