package sorting;

import static sorting.Sorting.print;

class bubbleSort {
    static void bubblesort(int a[]){
        boolean swappedElement = false;
        sort:for(int i=0;i<a.length;i++){
                for (int j=0; j < a.length-1; j++) {
                    if(a[j]>a[j+1]){
                        swap(a, j, j+1);
                        swappedElement=true;
                    }
                    
                }
                
                if(!swappedElement){
                  break sort;
                }
            }
    }
    
    static void swap(int a[],int p,int q){
                    int temp = a[p];
                    a[p]=a[q];
                    a[q]=temp;
    }
}