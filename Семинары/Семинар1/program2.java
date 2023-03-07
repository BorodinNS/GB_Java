package Семинар1;

import java.util.Arrays;

/* Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему. */
public class program2 {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 4, 3, 2, 3, 8, 5 };
        int val = 3;
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == val) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = arr[arr.length - 1];
                arr[arr.length - 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}