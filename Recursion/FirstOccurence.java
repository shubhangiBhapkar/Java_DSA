public class FirstOccurence {

    //First Occurence
    public static int isFirst(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return isFirst(arr, key, i+1);
    }


    public static void main(String[] args){
        int arr[]={8,3,6,9,5,10,2,5,3};
        int key=5;
        System.out.println(isFirst(arr,key,0));
    }
    
}
