package Ordenar;
import Ordenar.MergeSort;
import Ordenar.InsertionSort;

public class TimSort{
    public static int[] TimSort(int[]arr){
        sort(arr);
        return arr;
    }
    static int MIN_MERGE = 32;
 
    private static int minRunLength(int n){
        assert n >= 0;
        int r = 0;
        while (n >= MIN_MERGE)
        {
            r |= (n & 1);
            n >>= 1;
        }
        return n + r;
    }
    private static void sort(int[] arr)
    {
        int n=arr.length;
        int minRun = minRunLength(MIN_MERGE);
        for (int i = 0; i < n; i += minRun){
            arr=InsertionSort.sort(arr, i,Math.min((i + MIN_MERGE - 1), (n - 1)));
        }
        for (int size = minRun; size < n; size = 2 * size){
            for (int left = 0; left < n;left += 2 * size){
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1),(n - 1));
                  if(mid < right)
                   MergeSort.merge(arr, left, mid, right);
            }
        }
    }
 
 
}
