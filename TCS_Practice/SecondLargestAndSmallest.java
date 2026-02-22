import java.util.Scanner;
public class SecondLargestAndSmallest {
    public static int secondLargest(int arr[],int n){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest=arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static int secondSmallest(int arr[],int n){
        int smallest = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;;
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                secSmall = smallest;
                smallest = arr[i];
            }else if(arr[i] < secSmall && arr[i]!= smallest){
                secSmall = arr[i];
            }
        }
        return secSmall;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array elements:");
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("second largest:"+secondLargest(arr,n));
        System.out.println("second Small:"+secondSmallest(arr,n));
    }

}
