public class LastOccurence {
    public static int isLast(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int found=isLast(arr, key, i+1);
        if(found==-1 && arr[i]==key){
            return i;
        }
        return found;
    }
    public static void main(String[] args){
        int arr[]={8,3,2,4,5,8,5,9};
        System.out.println(isLast(arr,5,0));
    }
}
