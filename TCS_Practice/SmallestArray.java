import java.util.Scanner;

public class SmallestArray{
 public static int getMin(int arr[],int n){
    int min = Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        if(i<=min){
            min = arr[i];
        }
    }
    return min;
 }
public static int getMax(int arr[],int n){
    int max = Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        if(arr[i]>=max){
            max = arr[i];
        }
    }
    return max;
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array Elements :");
    int arr[] = new int[10];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Maximum element in the array is: " + getMax(arr,arr.length));
    System.out.println("Minimum element in the array is: " + getMin(arr,arr.length));
    
}
}