package sorting;
class quickSort {
    static void quicksort(int a[],int low,int high){
        int p = partition(a,low,high);
        if(low<p-1){
            quicksort(a, low, p-1);
        }
        if(p<high){
            quicksort(a, p, high);
        }
    }
    static int partition(int a[],int low,int high){
        //take low as the pivot
        int i=low,j=high;
        int temp;
        int pivot = a[(low+high)/2];
        
        while(i<=j){
            while(a[i]<pivot){i++;}
            while(a[j]>pivot){j--;}
            
            if(i<=j){
                swap(a,i,j);
                i++;
                j--;
            }
        }
        return i;
    }
    static void swap(int a[],int p,int q){
                    int temp = a[p];
                    a[p]=a[q];
                    a[q]=temp;
    }
}
