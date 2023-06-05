package Main;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import Ordenar.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        long inicio = 0, fin = 0;
        double tiempo = 0.000000D;
        String salida;
        Scanner leer = new Scanner(System.in);
        String ruta = "archivo.entrada";
        File file = new File(ruta);
        List<Integer> lista;
        int[] arr ;
        float[] arrF = null;
       

        String[] menu = {"Burbuja", "Selection Sort", "Insertion Sort", "Merge Sort",
            "Quick Sort", "Radix Sort", "Bucket Sort", "Shell Sort",
            "Comb Sort", "Tim Sort", "Pigeonhole Sort", "Cycle Sort",
            "Cocktail Sort", "Pancake Sort", "Stooge Sort",
            "Brick Sort", "Gnome Sort", "Salir"};
        int op = 0;
        while (op != menu.length) {
            System.out.println("0- Recargar archivo de entrada");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + " - " + menu[i]);

            }
            salida = "";
            op = leer.nextInt();
            file = new File(ruta);
            lista = leer(file);
            arr = new int[lista.size()];
            //si se modifica el archivo de entrada es necesario 
            //terminar con la interaccion en curso
            for (int i = 0; i < arr.length; i++) {
                arr[i] = lista.get(i);
            }
             inicio = System.currentTimeMillis();
           
            System.out.println(inicio);
            
            switch (op) {
                case 0:
                    System.out.println("Regargando");
                    break;
                case 1:
                    Burbuja.Burbuja(arr);
                    break;
                case 2:
                    SelectionSort.SelectionSort(arr);
                    break;
                case 3:
                    InsertionSort.InsertionSort(arr);
                    break;
                case 4:
                    MergeSort.MergeSort(arr);
                    break;
                case 5:
                    QuickSort.QuickSort(arr);
                    break;
                case 6:
                    RadixSort.RadixSort(arr);
                    break;
                case 7:
                    arrF = new float[arr.length];
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] >= 1) {
                            arrF[i] = (float) Math.pow(arr[i], -1);
                            if (arr[i] == 1) {
                                arrF[i] = (float) .1;
                            }
                        }
                    }

                    BucketSort.BucketSort(arrF);
                    break;

                case 8:
                    ShellSort.ShellSort(arr);
                    break;

                case 9:
                    CombSort.CombSort(arr);
                    break;

                case 10:
                    TimSort.TimSort(arr);
                    break;

                case 11:
                    PigeonholeSort.PigeonholeSort(arr);
                    break;

                case 12:
                    CycleSort.CycleSort(arr);
                    break;

                case 13:
                    CocktailSort.cocktailSort(arr);
                    break;

                case 14:
                    PancakeSort.PancakeSort(arr);
                    break;

                case 15:
                    StoogeSort.StoogeSort(arr);
                    break;

                case 16:
                    BrickSort.BrickSort(arr);
                    break;
                case 17:
                    GnomeSort.GnomeSort(arr);
                    break;
                case 18:
                    System.out.println("Adios");

                    break;
                default:
                    System.out.println("No disponible");
                    break;
            }
            fin = System.currentTimeMillis();
            System.out.println(fin);
            tiempo = (double) ((fin - inicio));
            System.out.println(tiempo);
            if (op > 17 || op==0) {

            } else {
                System.out.println("Analizando ..." + menu[op - 1]);
                salida = "";
                salida += menu[op - 1] + "\n";
                salida += "Tiempo estimado de ejecución: "+tiempo+" ms\n";
                file = new File("salida.txt");
                if (arrF != null) {
                    for (float i : arrF) {
                        salida = salida + i + "\n";
                    }
                    arrF = null;
                } else {
                    for (int i : arr) {
                        salida = salida + i + "\n";
                    }
                }

                escribir(file, salida, false);
                System.out.println("Terminado ..." + menu[op - 1]);
            }
        }

        // op = leer.nextInt();
        //  metodo.MargeSort(arr, 0, arr.length-1);
    }

    static List leer(File fichero) {
        List<Integer> lista = new ArrayList<Integer>();
        Scanner s = null;
        try {
            s = new Scanner(fichero);
            while (s.hasNextInt()) {
                lista.add(s.nextInt());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception e) {
                System.out.println("Mensaje 2: " + e.getMessage());
            }
        }
        return lista;
    }

    static void escribir(File file, String contenido, boolean sobreescribir) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(file, sobreescribir);
            pw = new PrintWriter(fichero);
            pw.println(contenido);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

}
