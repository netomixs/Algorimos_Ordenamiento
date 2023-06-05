package Ordenar;

import java.util.Collections;
import java.util.Vector;


public class BucketSort{
    public static float[] BucketSort(float[] arr){
        sort(arr);
        return arr;
    }
    private static float[] sort(float arr[]){
        int n=arr.length;
        if (n <= 0){
             return arr; 
        }
       
        Vector<Float>[] buckets = new Vector[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<Float>();
        }
        for (int i = 0; i < n; i++) {
            int idx = (int) arr[i] * n;
           
            buckets[idx].add(arr[i]);
            
        }
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
        return arr;
    }
}
