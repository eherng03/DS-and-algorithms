package com.evahergar;

public class Decompress {

    public static void main(String[] args){
        System.out.println(decompressString("3[abc]4[ab]c"));
        System.out.println(decompressString("10[a]"));
        System.out.println(decompressString("2[3[a]b]"));
        System.out.println(decompressString("0[abc]"));
    }

    private static String decompressString(String s) {
        return decompressRecursive(0, s, "", "", "");
    }

    public static  String decompressRecursive(int i, String input, String repetitions, String repeated, String solution){
        if(i == input.length()){
            return solution;
        }

        char actual = input.charAt(i);
        if(actual > 47 && actual < 58){
            // Is a number
            return decompressRecursive(++i, input, repetitions + actual, repeated, solution);

        }else if(actual == ']'){

            return repeated;

        }else if(actual == '['){
            int rep = Integer.parseInt(repetitions);
            String part = decompressRecursive(++i, input, "", repeated, solution);
            StringBuilder solutionB = new StringBuilder();
            for(int j = 0; j < rep; j++){
                solutionB.append(part);
            }
            solution = solution + solutionB.toString();
            i = i + part.length() + 1;
            return solution + decompressRecursive(i, input, "", "", "");
        }else{
            // Letters
            while(actual != ']' && i < input.length()){
                repeated = repeated + actual;
                i++;
                if(i < input.length()) {
                    actual = input.charAt(i);
                }
            }
            if(repetitions == ""){
                solution = solution + repeated;
            }
            return decompressRecursive(i, input, repetitions, repeated, solution);
        }
    }
}
