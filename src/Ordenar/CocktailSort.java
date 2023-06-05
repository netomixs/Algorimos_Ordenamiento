package Ordenar;


public class CocktailSort{
    public static int[]cocktailSort(int arr[]){
        sort(arr);
        return arr;
    }
     private static int[] sort(int arr[]){
        boolean cambio = true;
        int inicio = 0;
        int fin = arr.length;
        while (cambio == true){
            cambio = false;
            for (int i = inicio; i < fin - 1; ++i)
            {
                if (arr[i] > arr[i + 1]) {
                    int aux = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = aux;
                    cambio = true;
                }
            }
            if (cambio == false){
                 break; 
            }
            cambio = false;
            fin--;
            for (int i = fin - 1; i >= inicio; i--){
                if (arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    cambio = true;
                }
            }
            inicio++;
        }
        return arr;
    }
    
}
