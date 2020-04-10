package com.evahergar;

import java.util.ArrayList;

public class LinkedListCycle {



    /***
     * Given a string of lowercase letters in the range ascii[a-z], determine a character
     * that can be removed to make the string a palindrome. There may be more than one
     * solution, but any will do. For example, if your string is "bcbc", you can either
     * remove 'b' at index  or 'c' at index . If the word is already a palindrome or there
     * is no solution, return -1. Otherwise, return the index of a character to remove.
     * @param args
     */
    public static void main(String[] args) {
        Node first = new Node();
        first.data = 1;
        Node second = new Node();
        second.data = 2;
        first.next = second;
        second.next = first;
        System.out.println(hasCycle(first));
    }

    public static boolean hasCycle(Node head) {
        ArrayList<Node> visitedNodes = new ArrayList<>();
        Node aux = head;
        while(aux != null && aux.next != null){
            if(visitedNodes.contains(aux)){
                if(aux.next == visitedNodes.get(visitedNodes.indexOf(aux)).next){
                    return true;
                }
                visitedNodes.add(aux);
            }else{
                visitedNodes.add(aux);
                aux = aux.next;
            }

        }
        return false;

    }
}

class Node {
    int data;
    Node next;
}
