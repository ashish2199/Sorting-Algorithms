package sorting;
class insertionSort {
    //here we are inserting the element in already sorted list
    static void insertionsort(int a[]){
        for(int i=1;i<a.length;i++){
            //move backward till 0
            for(int j=i;j>0;j--){
                
                if(a[j]<a[j-1]){
                    swap(a,j,j-1);
                }
            }
        }
    }
    static void swap(int a[],int p,int q){
                    int temp = a[p];
                    a[p]=a[q];
                    a[q]=temp;
    }
}
