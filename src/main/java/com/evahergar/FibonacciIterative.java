package com.evahergar;

import java.util.ArrayList;
import java.util.HashMap;

public class FibonacciIterative {



    /***
     * Given a string of lowercase letters in the range ascii[a-z], determine a character
     * that can be removed to make the string a palindrome. There may be more than one
     * solution, but any will do. For example, if your string is "bcbc", you can either
     * remove 'b' at index  or 'c' at index . If the word is already a palindrome or there
     * is no solution, return -1. Otherwise, return the index of a character to remove.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }
    public static int fibonacci(int n) {
        int sum = 0;
        int anterior = 0;
        int dosAnteriores = 0;
        for(int i = 0; i < n; i ++){
            if(i == 0){
                sum = sum + 0;
            }else if( i == 1){
                sum = sum + 1;
            }

        }
        return 0;
    }
}
