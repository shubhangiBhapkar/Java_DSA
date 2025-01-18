public class LargeNo {

    public static int greater(int arr[]){
            int largest=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>largest){
                    largest=arr[i];
                }
            }
            return largest;
        }
        public static void main(String a[]){
            
            int arr[]={2,4,7,5,9,3,0,4,8};
            
            System.out.println("Largest element is:"+greater(arr));
    }
}
