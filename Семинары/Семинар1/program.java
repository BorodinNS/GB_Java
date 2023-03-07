package Семинар1;
/**
Дан массив двоичных чисел, например [1,1,0,1,1,1],
вывести максимальное количество подряд идущих 1.
*/
import java.util.Arrays;

public class program {
    public static void main(String[] args) {

        int[] arr = new int[] { 1, 1, 0, 1, 1, 1 };
        int[] arr_count = new int[2];
        int count = 0;
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                arr_count[j] = count;
            } else {
                count = 0;
                j++;
            }
        }
        Arrays.sort(arr_count);
        int[] newarr = new int[arr_count[1]];
        for (int i = 0; i < arr_count[1]; i++) {
            newarr[i] = 1;

            System.out.println(arr_count[1]);
            System.out.println(Arrays.toString(newarr));
        }

    }
}