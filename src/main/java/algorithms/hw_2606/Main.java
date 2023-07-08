package algorithms.hw_2606;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array1 = {2, 3, 7, 5};
        int[] array2 = {8, 4, 6, 1, 10};
        System.out.println(Arrays.toString(sort(combination(array1, array2))));

    }

    public static int[] combination(int[] array1, int[] array2) {
        int i = 0;
        int j = 0;
        int[] array = new int[array1.length + array2.length];
        int k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                array[k++] = array1[i++];
            }
            else array[k++] = array2[j++];
        }
        while (i< array1.length)
            array[k++] = array1[i++];
        while (j< array2.length)
            array[k++] = array2[j++];
        return array;
    }

    public static int[] sort(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int middle = array.length/2;
        int[] left = Arrays.copyOfRange(array, 0, middle);
        int[] right = Arrays.copyOfRange(array, middle, array.length);
        return combination(sort(left), sort(right));
    }

}

