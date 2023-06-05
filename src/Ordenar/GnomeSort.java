
package Ordenar;


public class GnomeSort {

    public static int[] GnomeSort(int[] arr) {
        sort(arr);
        return arr;
    }
    public static int []sort(int arr[]){
        int n=arr.length;
        int index = 0;
        while (index < n)
        {
            if (index == 0) index++;
            if (arr[index] >= arr[index - 1]) index++;
            else {
                int menor = 0;
                menor = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = menor;
                index--;
            }
        }

        return arr;
        
    }
 
}
