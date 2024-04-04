package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {11, 3, 14, 16, 7};

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    isSorted = false;
                    System.out.println(Arrays.toString(array));
                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;

                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("----------------------------------------------------");

        int[] ar = new int[]{2, 1, 65, 3, 43, 23, 44, 67, 65, 76};
        int buffer;
        boolean isSorted2 = false;

        while (!isSorted2) {
            isSorted2 = true;
            for (int i = 0; i < ar.length - 1; i++) {
                if(ar[i] > ar[i + 1]){
                    System.out.println(Arrays.toString(ar));
                    isSorted2 = false;
                    buffer = ar[i + 1];
                    ar[i + 1] = ar[i];
                    ar[i] = buffer;
                }
            }
        }
        System.out.println(Arrays.toString(ar));



    }
}
