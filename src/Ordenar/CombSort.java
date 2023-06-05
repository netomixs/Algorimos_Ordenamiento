package Ordenar;


public class CombSort{
    public static int[] CombSort(int arr[]){
        sort(arr);
        return arr;
    }
     private static int getNextGap(int n){
        n = (n*10)/13;
        if (n < 1)
            return 1;
        return n;
    }
    private static int[] sort(int arr[]){
        int n = arr.length;
        int pivote = n;
        int aux;
        boolean cambio = true;
        while (pivote != 1 || cambio == true){
            pivote = getNextGap(pivote);
            cambio = false;
            for (int i=0; i<n-pivote; i++){
                if (arr[i] > arr[i+pivote]){
                    aux = arr[i];
                    arr[i] = arr[i+pivote];
                    arr[i+pivote] = aux;
                    cambio = true;
                }
            }
        }
        return arr;
    }  
}
