package org.Assign;

import java.util.ArrayList;


public class NonMatchingArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 7};
        int[] arr2 = {3, 4, 5, 6};

        int[] result = getNonMatchingElements(arr1, arr2);

        System.out.print("Non-matching elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] getNonMatchingElements(int[] arr1, int[] arr2) {
        ArrayList<Integer> nonMatching = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            if (!contains(arr2, arr1[i])) {
                nonMatching.add(arr1[i]);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (!contains(arr1, arr2[i])) {
                nonMatching.add(arr2[i]);
            }
        }

        int[] result = new int[nonMatching.size()];
        for (int i = 0; i < nonMatching.size(); i++) {
            result[i] = nonMatching.get(i);
        }

        return result;
    }

    public static boolean contains(int[] arr, int value) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == value) {
                return true;
            }
        }
        return false;
    }
}
