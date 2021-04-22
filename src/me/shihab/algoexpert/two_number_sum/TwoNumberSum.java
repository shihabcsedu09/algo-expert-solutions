package me.shihab.algoexpert.two_number_sum;

import java.util.Arrays;

public class TwoNumberSum {
    public static int[] twoNumberSum_Solution1(int[] array, int targetSum) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    return new int[]{array[i], array[j]};
                }
            }
        }
        return new int[0];
    }

    public static int binarySearch(int[] arr, int l, int r, int number) {
        if (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == number) {
                return mid;
            } else if (arr[mid] > number) {
                return binarySearch(arr, l, mid - 1, number);
            } else {
                return binarySearch(arr, mid + 1, r, number);
            }
        }
        return -1;
    }

    public static int[] twoNumberSum_Solution2(int[] array, int targetSum) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = binarySearch(array, i + 1, array.length - 1, targetSum - array[i]);
            if (index > 0) {
                return new int[]{array[i], array[index]};
            }
        }
        return new int[0];
    }


    public static void main(String[] args) {
        int[] result = twoNumberSum_Solution2(new int[]{-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 163);
        Arrays.stream(result).forEach(System.out::println);
    }


}
