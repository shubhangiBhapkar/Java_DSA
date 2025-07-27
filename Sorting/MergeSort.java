public class MergeSort {
    public static void printArr(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeSort(int arr[],int si,int ei){
        
        if(si >= ei){
            return;
        }
        int mid =(si+ei)/2; //mid calculated
        mergeSort(arr, si, mid); // Left part
        mergeSort(arr, mid+1, ei); //Right part
        merge(arr,si, mid,ei);
    }
    public static void merge(int arr[],int si,int mid ,int ei){
        int temp[]=new int[ei-si+1];
        int i=si; //Left part iterator
        int j=mid+1; //Right part iterator
        int k= 0; //temp array iterator

        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;               
            }
            k++;
        }
        //left part remain
        while (i<=mid) {
            temp[k++]=arr[i++];            
        }
        //Right part remain
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        // copy temp array to original
        for(k=0 ,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args){
        int arr[]={3,6,2,8,4,9};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
