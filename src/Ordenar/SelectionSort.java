package Ordenar;


public class SelectionSort{

    public static int[] SelectionSort(int[] arr) {
        sort(arr);
        return arr;
    }
     private static  int [] sort(int arr[]){
       int minimo,aux;
       int fin=arr.length;
       for(int i=0;i<fin;i++){
           minimo=i;
           for(int j=i+1;j<fin;j++){
               if(arr[j]<arr[minimo]){
                   minimo=j;
               }
           }
                aux=arr[minimo];
                arr[minimo]=arr[i];
                arr[i]=aux;
       }
        return arr;
    }
    
}
