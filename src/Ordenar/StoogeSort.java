package Ordenar;

public class StoogeSort {

    public static int[] StoogeSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    private static int[] sort(int arr[], int l, int h) {
        if (l >= h) {
            return arr;
        }

        if (arr[l] > arr[h]) {
            int t = arr[l];
            arr[l] = arr[h];
            arr[h] = t;
        }
        if (h - l + 1 > 2) {
            int t = (h - l + 1) / 3;
            sort(arr, l, h - t);
            sort(arr, l + t, h);
            sort(arr, l, h - t);
        }
        return arr;
    }
}
