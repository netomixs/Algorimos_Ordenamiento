package Ordenar;


public class ShellSort{

    public static int[] ShellSort(int[]arr ) {
        sort(arr);
        return arr;
    }
    private static int[] sort(int arr[]){
        int n = arr.length;
        int aux,j;
        for (int k = n/2; k > 0; k /= 2){ 
            for (int i = k; i < n; i += 1){  
                aux = arr[i];
                for (j = i; j >= k && arr[j - k] > aux; j -= k){
                     arr[j] = arr[j - k];
                }
                arr[j] = aux;
            }
        }
        return arr;
    }
    
}
