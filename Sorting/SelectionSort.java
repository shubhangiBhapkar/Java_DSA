import java.util.Arrays;

public class SelectionSort {
    public static int[] Sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos] > arr[j]){
                    minpos=j;
                }
            }
            //swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        return arr;
       
    }
    public static void main(String[] args) {
        int arr[]={5,3,4,2,1};
        System.out.println(Arrays.toString(Sort(arr)));
    }
}
