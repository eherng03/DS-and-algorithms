package com.evahergar;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {





    private static void isBalanced(String result) {
        char[] array = result.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char ch : array){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else if(!stack.isEmpty()){
                char popped = stack.pop();
                if(ch == '}' && popped != '{'){
                    System.out.println("NO");
                    return;
                }else if(ch == ']' && popped != '['){
                    System.out.println("NO");
                    return;
                }else if(ch == ')' && popped != '('){
                    System.out.println("NO");
                    return;
                }
            }
        }

        if(stack.isEmpty()){
            System.out.println("YES");
        }else{
            System.out.println("No");
        }
    }

    /***
     * Write a function to generate all valid nested parenetis for a given value N. So for example:
     * If N = 1: "()"
     * if N = 2: "()()", "(())"
     * if N = 3: "()()()","()(())","(())()","(()())","((()))"
     * @param args
     */
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String expression = scanner.nextLine();
            isBalanced(expression);
        }

        scanner.close();
    }
}
