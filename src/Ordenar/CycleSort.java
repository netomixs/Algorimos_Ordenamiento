package Ordenar;


public class CycleSort{
    public static int[]CycleSort(int[] arr){
        sort(arr);
        return arr;
    }
     private static int[] sort(int arr[])
    {
        int n=arr.length;
        int linea = 0;
        for (int inicio = 0; inicio <= n - 2; inicio++) {
            int item = arr[inicio];
            int pos = inicio;
            for (int i = inicio + 1; i < n; i++){
                if (arr[i] < item){
                    pos++;
                }
            }
            if (pos == inicio){
                continue;
            }
            while (item == arr[pos]){
                pos += 1;
            }
            if (pos != inicio) {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
                linea++;
            }
            while (pos != inicio) {
                pos = inicio;
                for (int i = inicio + 1; i < n; i++){
                    if (arr[i] < item){
                        pos += 1;
                    }
                }
                while (item == arr[pos]){
                        pos += 1;
                }
                if (item != arr[pos]) {
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                    linea++;
                }
            }
        }
        return arr;
    }
    
}
