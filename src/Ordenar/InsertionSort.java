package Ordenar;


public class InsertionSort{
    public static int[]InsertionSort(int arr[]){
        sort(arr,0,arr.length);
        return arr;
    }
    /*protected static int[] sort(int arr[]){
        int llave;
        int n=arr.length;
        for (int i = 1; i < n; ++i) {
            llave = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > llave) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = llave;
        }
        return arr;
    }*/
      protected static  int[] sort(int[] arr, int inicio,int fin){
          int llave;
        for (int i = inicio + 1; i < fin; i++){
            llave = arr[i];
            int j = i - 1;
            while (j >= inicio && arr[j] > llave){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = llave;
        }
        return arr;
    }
}
