public class Questions {

    //For given integer array of size N.u have to find all the occurences(indices) of element(key)
    
    public static void getOccurence(int arr[],int i,int key){
        if(i==arr.length){
            return;
        }
        if(key==arr[i]){
            System.out.print(i);
            
        }
        getOccurence(arr, i+1, key);
    }

    //Length of string

    public static int getLength(String str,int i,int len){

        if(str.charAt(i)=='/'){
         System.out.println(len);
        }
        return getLength(str,i+1,len+1);
    }
    public static void main(String[] args){
        // int arr[]={3,2,4,5,6,2,7,2,2};
        // getOccurence(arr,0,2);

        getLength("Shubhangi/",0,0);
    }
}
