package com.evahergar;

import java.util.Stack;

public class Parenthesis {

    public static void createParenthesis(int number, int count, String result){
        if(count == number){
            if(resultMakesSense(result)){
                System.out.println(result);
                return;
            }else{
                return;
            }
        }else{
            count++;
            createParenthesis(number, count, result + "(");
            createParenthesis(number, count, result + ")");
        }
    }



    private static boolean resultMakesSense(String result) {
        char[] array = result.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char ch : array){
            if(ch == '('){
                stack.push(ch);
            }else if(!stack.isEmpty()){
                stack.pop();
            }else{
                return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    /***
     * Write a function to generate all valid nested parenetis for a given value N. So for example:
     * If N = 1: "()"
     * if N = 2: "()()", "(())"
     * if N = 3: "()()()","()(())","(())()","(()())","((()))"
     * @param args
     */
    public static void main(String[] args) {
        int n = 1;
        System.out.println("With 1:");
        createParenthesis(n*2, 0, "");
        System.out.println("With 2:");
        n = 2;
        createParenthesis(n*2, 0, "");
        System.out.println("With 3:");
        n = 3;
        createParenthesis(n*2, 0, "");
        System.out.println("With 4:");
        n = 4;
        createParenthesis(n*2, 0, "");
        System.out.println("With 10:");
        n = 10;
        createParenthesis(n*2, 0, "");
    }
}
