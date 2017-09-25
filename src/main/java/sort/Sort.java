package sort;

import utils.Utils;

/**
 * Created by zfhuo on 8/26/17.
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5, 10, 7, 8, 9};

        //insertSort
        mergeSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void bubblingSort(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void selectSort(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr.length - i;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[tmp]) {
                    tmp = j;
                }
            }

            int t = arr[tmp];
            arr[tmp] = arr[arr.length - i];
            arr[arr.length - i] = t;
        }
    }

    public static void insertSort(int[] arr) {
        if (arr == null) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while(j >= 1 && arr[j] < arr[j - 1]) {
                Utils.swap(arr, j, j-1);
                j = j-1;
            }
        }
    }

    public static void mergeSort(int[] arr) {
        if(arr != null) {
            mergeSort(arr, new int[arr.length], 0, arr.length - 1);
        }
    }
    private static void mergeSort(int[] arr, int[] tmp, int begin, int end) {
        if(end <= begin) {
            return;
        }
        int flag = begin + (end - begin)/2;
        mergeSort(arr, tmp, begin, flag);
        mergeSort(arr, tmp, flag + 1, end);

        int l = begin;
        int m = flag + 1;
        int i = begin;
        while(l <= flag && m <= end) {
            if(arr[l] < arr[m]) {
                tmp[i++] = arr[l++];
            } else {
                tmp[i++] = arr[m++];;
            }
        }
        while (l <= flag) {
            tmp[i++] = arr[l++];
        }
        while (m <= end) {
            tmp[i++] = arr[m++];
        }

        for (int j = begin; j <= end; j++) {
            arr[j] = tmp[j];
        }
    }

    //1 4 2 3
    public static void quickSort(int[] arr) {
        if(arr != null) {
            quickSort(arr, 0, arr.length - 1);
        }
    }

    private static void quickSort(int[] arr, int begin, int end) {
        if (end <= begin) {
            return;
        }

        int index = begin;
        int flag = end;

        for (int i = begin; i < end; i++) {
            if (arr[i] < arr[flag]) {
                Utils.swap(arr, i, index++);
            }
        }
        Utils.swap(arr, end, index);
        quickSort(arr, begin, index - 1);
        quickSort(arr, index + 1, end);
    }
}
