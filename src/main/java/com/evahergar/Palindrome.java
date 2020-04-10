package com.evahergar;

import java.util.Stack;

public class Palindrome {



    /***
     * Given a string of lowercase letters in the range ascii[a-z], determine a character
     * that can be removed to make the string a palindrome. There may be more than one
     * solution, but any will do. For example, if your string is "bcbc", you can either
     * remove 'b' at index  or 'c' at index . If the word is already a palindrome or there
     * is no solution, return -1. Otherwise, return the index of a character to remove.
     * @param args
     */
    public static void main(String[] args) {
        String n = "aaa";
        System.out.println(getPalindromeIndex(n));
        n = "abaa";
        System.out.println(getPalindromeIndex(n));
        n = "ababa";
        System.out.println(getPalindromeIndex(n));
        n = "aaaaaaaaaaaaaaaaaaaaaaaabaaaaaa";
        System.out.println(getPalindromeIndex(n));
    }

    private static int getPalindromeIndex(String n) {
        char[] chararray = n.toCharArray();
        if(isPalindrome(chararray)){
            return -1;
        }
        for(int i = 0; i < n.length()/2; i++){
            char aux = chararray[i];
            if(aux != chararray[chararray.length - 1 - i]){
                if(isPalindrome(removeIndex(i, chararray))){
                    return i;
                }else if (isPalindrome(removeIndex(chararray.length - 1 - i, chararray))){
                    return chararray.length - 1 - i;
                }
            }

        }
        return -1;
    }

    private static char[] removeIndex(int i, char[] chararray) {
        char[] result = new char[chararray.length-1];
        int auxIndex = 0;
        for(int j = 0; j < chararray.length-1; j++, auxIndex++){
            if(j == i){
                auxIndex++;
            }
            result[j] = chararray[auxIndex];
        }
        return result;
    }

    private static boolean isPalindrome(char[] charArray) {
        int lastElement = charArray.length -1;
        for(int i = 0; i < charArray.length/2; i++){
            if(charArray[i] != charArray[lastElement-i]){
                return false;
            }
        }
        return true;
    }
}
