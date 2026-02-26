import java.util.*;
public class ReverseArray {

    public static void Reverse(int arr[],int n){
        int j= n-1;
        for(int i=0;i<j;i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; 
            j--;
        }

        System.out.println("Reverse Array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter total number of elements in array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Reverse(arr,n);
    }
}
