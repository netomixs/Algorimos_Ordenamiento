package Ordenar;


public class PancakeSort{
    public static int[] PancakeSort(int[]arr){
        sort(arr);
        return arr;
        
    }
    private static void flip(int arr[], int i) {
        int aux, inicio = 0;
        while (inicio < i){
            aux = arr[inicio];
            arr[inicio] = arr[i];
            arr[i] = aux;
            inicio++;
            i--;
        }
    }
    private static int findMax(int arr[], int n){
        int j,i;
        for (j = 0, i = 0; i < n; ++i)
            if (arr[i] > arr[j])
                j = i;
        return j;
    }
    private static int[] sort(int arr[]){
        int n=arr.length;
        int s;
        for (int i = n; i > 1;--i){
            s = findMax(arr, i);
            if (s != i-1){
                flip(arr, s);
                flip(arr, i-1);
            }
        }
        return arr;
    }
    
}
