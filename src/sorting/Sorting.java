package sorting;

import java.util.Random;
import static sorting.quickSort.quicksort;
import static sorting.selectionSort.selectionsort;
import static sorting.insertionSort.insertionsort;
import static sorting.bubbleSort.bubblesort;

public class Sorting {
    
    
    
    static void print(int a[]){
        System.out.println("\n starting to print");
        for(int i=0;i<a.length;i++){
            System.out.print(""+a[i]+" ");
        }
        System.out.println("");
    }
    
    static int[] generateRandomArray(int size){
        int a[]=new int[size];
        Random rand = new Random();
        
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        /*
        Fisher–Yates shuffle algorithm
        for i from 0 to n − 2 do
            j ← random integer such that i ≤ j < n
            exchange a[j] and a[i]
        */
        for (int i = 0; i < a.length-3; i++) {
            int min = i;
            int max = a.length;
            
            int r = rand.nextInt((max - min)) + min;
            swap(a,i,r);
        }
        return a;
    }
    static void swap(int a[],int p,int q){
                    int temp = a[p];
                    a[p]=a[q];
                    a[q]=temp;
    }
    public static void main(String[] args) {
        
        
        int size=1000;
        int a[]= generateRandomArray(size);
        int a1[]=new int[size];
        int a2[]=new int[size];
        int a3[]=new int[size];
        int a4[]=new int[size];
        
        
        System.arraycopy(a, 0, a1, 0, a.length);
        System.arraycopy(a, 0, a2, 0, a.length);
        System.arraycopy(a, 0, a3, 0, a.length);
        System.arraycopy(a, 0, a4, 0, a.length);
        
        
        System.out.println("\n Sorting Algos");
        
        long startTimeSelection = System.nanoTime();
        selectionsort(a1);
        long stopTimeSelection = System.nanoTime();
        System.out.printf("The running time of selection sort is %-8d \n", (stopTimeSelection - startTimeSelection));
        //print(a1);
        
        long startTimeInsertion = System.nanoTime();
        insertionsort(a2);
        long stopTimeInsertion = System.nanoTime();
        System.out.printf("The running time of insertion sort is %-8d \n", (stopTimeInsertion - startTimeInsertion));
        //print(a2);
        
        long startTimeQuick = System.nanoTime();
        int low = 0;
        int high = a3.length-1;
        quicksort(a3,low,high);
        long stopTimeQuick = System.nanoTime();
        System.out.printf("The running time of quicksort      is %-8d \n", (stopTimeQuick - startTimeQuick));
        //print(a3);
        
        long startTimeBubble = System.nanoTime();
        bubblesort(a4);
        long stopTimeBubble = System.nanoTime();
        System.out.printf("The running time of bubble sort    is %-8d \n", (stopTimeBubble - startTimeBubble));
        //print(a4);
    }
    
}
