package me.shihab.algoexpert.validate_subsequence;

import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int j = 0;
        for(int i=0; i< array.size(); i ++) {
            if(array.get(i).equals(sequence.get(j)) ){
                if(j == sequence.size() -1 ) return true;
                else j++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(22, 25, 6);
        System.out.println(isValidSubsequence(array, sequence));
    }

}
