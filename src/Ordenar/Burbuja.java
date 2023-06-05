package Ordenar;


public class Burbuja{
    public static int[] Burbuja(int[] arr){
        sort(arr);
        return arr;
    }
       private static int [] sort(int arr[]){
        int n=arr.length;
        int aux=0;
        for(int i=1;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                  aux=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=aux;
                }
            }
        }
        return arr;
    }
}
