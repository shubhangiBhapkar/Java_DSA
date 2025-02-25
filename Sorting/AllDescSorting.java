import java.util.Arrays;

public class AllDescSorting {
    public static int[]BubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int swap=0;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                return arr;
            }
        }
        return arr;
    }
     public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        System.out.println(Arrays.toString(BubbleSort(arr))); 
    }
}
