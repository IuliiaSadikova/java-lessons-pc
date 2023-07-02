package algorithms.hw_1906;

import java.util.Arrays;

/*
Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент,
который будет находиться на k-й позиции в конечном отсортированном массиве.

Массив 1 - 100 112 256 349 770
Массив 2 - 72 86 113 119 265 445 892
к = 7
Вывод : 256

Окончательный отсортированный массив -
72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
7-й элемент этого массива равен 256.
 */

public class Main {

    public static void main(String[] args) {

        int elemPosition;
        int[] array1 = {100, 112, 256, 349, 770};
        int[] array2 = {72, 86, 113, 119, 265, 445, 892};
        int desElem = merger(array1, array2, elemPosition = 7);
        System.out.println("Total number of elements: " + (array1.length + array2.length));
        System.out.println(elemPosition + "th number from two sorted arrays is: " + desElem);

    }

    public static int merger(int[] array1, int[] array2, int k) {
        int i = 0;
        int j = 0;
        int h = 0;
        int[] arr = new int[array1.length + array2.length];
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                arr[h++] = array1[i++];
            } else arr[h++] = array2[j++];
        }
        while (i < array1.length) {
            arr[h++] = array1[i++];
        }
        while (j < array2.length) {
            arr[h++] = array2[j++];
        }
        System.out.println("New array: " + Arrays.toString(arr));
        return arr[k - 1];
    }
}
