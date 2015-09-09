package sorting;

public class selectionSort {
    
    static int min(int a[],int start,int end){
        int minindex=start;
        for(int i=start;i<=end;i++){
            if(a[i]<a[minindex]){minindex=i;}
        }
        return minindex;
    }
    
    // in selection sort we select the minimum element
    static void selectionsort(int a[]){
        for(int i=0;i<a.length-1;i++){
                int min = min(a,i,a.length-1);
                swap(a,i,min);
            
        }
    }
    static void swap(int a[],int p,int q){
                    int temp = a[p];
                    a[p]=a[q];
                    a[q]=temp;
    }
}
