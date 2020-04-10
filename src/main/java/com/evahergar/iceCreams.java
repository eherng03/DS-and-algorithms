package com.evahergar;

import java.util.ArrayList;
import java.util.HashMap;

public class iceCreams {



    /***
     * Given a string of lowercase letters in the range ascii[a-z], determine a character
     * that can be removed to make the string a palindrome. There may be more than one
     * solution, but any will do. For example, if your string is "bcbc", you can either
     * remove 'b' at index  or 'c' at index . If the word is already a palindrome or there
     * is no solution, return -1. Otherwise, return the index of a character to remove.
     * @param args
     */
    public static void main(String[] args) {
        int[] prices = {2, 3, 5 , 6};
        whatFlavors(prices, 8);
    }

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {
        HashMap<Integer, ArrayList<Integer>> stock = new HashMap<>();
        for(int i = 0; i < cost.length; i++){
            ArrayList<Integer> aux = new ArrayList<>();
            if(stock.containsKey(cost[i])){
                aux = stock.get(cost[i]);
            }
            aux.add(i + 1);
            stock.put(cost[i], aux);
        }

        for(int key : stock.keySet()){
            if(stock.containsKey(money - key)){
                int toPrint1 = 0;
                int toPrint2 = 0;
                if(stock.get(key).size() == 1){
                    toPrint1 = stock.get(key).get(0);
                    toPrint2 = stock.get(money-key).get(0);
                }else {
                    toPrint1 = stock.get(key).get(0);
                    toPrint2 =  stock.get(money-key).get(1);
                }

                if(toPrint1 > toPrint2){
                    System.out.println(toPrint2 + " " + toPrint1);
                }else{
                    System.out.println(toPrint1 + " " + toPrint2);

                }

            }
        }
    }
}
