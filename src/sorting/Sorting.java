package sorting;

import java.util.Random;
//static import so that the functions can be used without their class names
import static sorting.quickSort.quicksort;
import static sorting.selectionSort.selectionsort;
import static sorting.insertionSort.insertionsort;
import static sorting.bubbleSort.bubblesort;
import static sorting.mergeSort.mergeSort;
public class Sorting {
    
    
    
    static void print(int a[]){
        //System.out.println("\n starting to print");
        for(int i=0;i<a.length;i++){
            System.out.print(""+a[i]+" ");
        }
        //System.out.println("");
    }
    static boolean isSorted(int a[]){
        for (int i = 0; i < a.length-2; i++) {
            if( a[i] > a[i+1] ){
                return false;
            }
        }
        return true;
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
        int a5[]=new int[size];
        
        System.arraycopy(a, 0, a1, 0, a.length);
        System.arraycopy(a, 0, a2, 0, a.length);
        System.arraycopy(a, 0, a3, 0, a.length);
        System.arraycopy(a, 0, a4, 0, a.length);
        System.arraycopy(a, 0, a5, 0, a.length);
        
        System.out.println("\nSorting Algos\n");
        
        long startTimeSelection = System.nanoTime();
        selectionsort(a1);
        if(!isSorted(a1)){
            System.out.println("ERROR :Didnot sort Correctly");
        }
        long stopTimeSelection = System.nanoTime();
        System.out.printf("The running time of selection sort is %-8d \n", (stopTimeSelection - startTimeSelection));
        //print(a1);
        
        long startTimeInsertion = System.nanoTime();
        insertionsort(a2);
        if(!isSorted(a2)){
            System.out.println("ERROR :Didnot sort Correctly");
        }
        long stopTimeInsertion = System.nanoTime();
        System.out.printf("The running time of insertion sort is %-8d \n", (stopTimeInsertion - startTimeInsertion));
        //print(a2);
        
        long startTimeQuick = System.nanoTime();
        int low = 0;
        int high = a3.length-1;
        quicksort(a3,low,high);
        if(!isSorted(a3)){
            System.out.println("ERROR :Didnot sort Correctly");
        }
        long stopTimeQuick = System.nanoTime();
        System.out.printf("The running time of quicksort      is %-8d \n", (stopTimeQuick - startTimeQuick));
        //print(a3);
        
        long startTimeBubble = System.nanoTime();
        bubblesort(a4);
        if(!isSorted(a4)){
            System.out.println("ERROR :Didnot sort Correctly");
        }
        long stopTimeBubble = System.nanoTime();
        System.out.printf("The running time of bubble sort    is %-8d \n", (stopTimeBubble - startTimeBubble));
        //print(a4);
        
        long startTimeMerge = System.nanoTime();
        a5=mergeSort(a5);
        if(!isSorted(a5)){
            System.out.println("ERROR :Didnot sort Correctly");
        }
        long stopTimeMerge = System.nanoTime();
        System.out.printf("The running time of merge  sort    is %-8d \n", (stopTimeMerge - startTimeMerge));
        //print(a5);
    }
    
}
