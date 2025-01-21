public class BinarySearch {

    public static int Search(int numbers[],int key){
        int start=numbers[0];
        int end=numbers.length-1;
         while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            if(numbers[mid]>key){
                end=mid-1;
            }

        }
        return -1;
    }
    public static void main(String a[]){
        int numbers[]={2,4,6,9,24,67,98};
        int key=24;
        System.out.println("key found at position : "+Search(numbers,key));

    }
}
