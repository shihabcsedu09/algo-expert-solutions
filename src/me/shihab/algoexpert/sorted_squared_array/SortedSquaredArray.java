package me.shihab.algoexpert.sorted_squared_array;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class SortedSquaredArray {

    public static int[] sortedSquaredArray(int[] array) {
        int[] finalArray = new int[array.length];

        if (array.length == 1) {
            return new int[]{array[0] * array[0]};
        }

        int firstPointer = 0;
        int lastPointer = array.length - 1;
        int finalArrayCurrentIndex = array.length - 1;

        while (firstPointer <= lastPointer) {
            int firstPointerValue = Math.abs(array[firstPointer]);
            int lastPointerValue = Math.abs(array[lastPointer]);

            if (firstPointerValue > lastPointerValue) {
                finalArray[finalArrayCurrentIndex] = firstPointerValue * firstPointerValue;
                firstPointer++;
            } else {
                finalArray[finalArrayCurrentIndex] = lastPointerValue * lastPointerValue;
                lastPointer--;
            }
            finalArrayCurrentIndex--;
        }
        return finalArray;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-2, -1};
        stream(sortedSquaredArray(array)).forEach(System.out::println);
    }

}


