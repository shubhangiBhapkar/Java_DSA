import java.util.Arrays;

public class InsertionSort {
    public static int[] Sort(int arr[]) {
       for(int i=1;i<arr.length;i++){
        int curr=arr[i];
        int prev=i-1;

        // finding position to insert element
        while(prev >= 0 && arr[prev] > curr){
            arr[prev+1]=arr[prev];
            prev--;
        }
        //insertion
        arr[prev+1]=curr;
       }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 4, 2, 1};
        System.out.println(Arrays.toString(Sort(arr)));
    }
}
