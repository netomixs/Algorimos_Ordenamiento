package Ordenar;


public class QuickSort{    
    public static int[]QuickSort(int[]arr){
        sort(arr,0,arr.length-1);
        return arr;
    }
   private static int[] sort(int arr[], int primero,int ultimo){
        int i,j,central;
        int pivote;
        central=(primero+ultimo)/2;
        pivote=arr[central];
        i=primero;
        j=ultimo;
        do{
            while(arr[i]<pivote){
                i++;
            }
            while(arr[j]>pivote){
                j--;   
            }
            if(i<=j){
                int aux;
                aux=arr[i];
                arr[i]=arr[j];
                arr[j]=aux;
                i++;
                j--;
            }
        }while(i<=j);
      
        if(primero<j){
            sort(arr, primero, j);
            
        }
        if(i<ultimo){
            sort(arr, i, ultimo);
        }
   return arr;
    }
}
