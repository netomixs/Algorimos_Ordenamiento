package Ordenar;


public class BrickSort{

    public static int[] BrickSort(int arr[]) {
        sort(arr);
        return arr;
    }
    private static int[] sort(int arr[]){
        int n=arr.length;
        boolean ordenado = false; 
        while (!ordenado){
            ordenado = true;
            int aux =0;
            for (int i=1; i<=n-2; i=i+2){
                if (arr[i] > arr[i+1]){
                    aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                    ordenado = false;
                }
            }
            for (int i=0; i<=n-2; i=i+2){
                if (arr[i] > arr[i+1]){
                    aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                    ordenado = false;
                }
            }
        }
       return arr;
    }
    
}
