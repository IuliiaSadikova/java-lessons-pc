package algorithms.hw_0307;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(2, 5, 3, -7, 12, 6, 0, 8);
        System.out.println(quickSort(array));



    }

    public static List<Integer> quickSort(List<Integer> array) {
        if (array.size() <= 1) {
            return array;
        }
        int pivot = array.get(array.size() - 1);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i) < pivot) {
                left.add(array.get(i));
            } else {
                right.add(array.get(i));
            }
        }
        List<Integer> newArray = new ArrayList<>();
        newArray.addAll(quickSort(left));
        newArray.add(pivot);
        newArray.addAll(quickSort(right));
        return newArray;
    }
}
