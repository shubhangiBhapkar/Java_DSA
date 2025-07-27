public class RotatedArraySearch {

    public static int Search(int arr[],int tar,int si,int ei){
        //Base condition
        if(si>ei){
            return -1;
        }

        //kaam
        int mid= (si+ei)/2;

        //mid == tarrget
        if(arr[mid]==tar){
            return mid;
        }
        //mid on L1
        if(arr[si] <= arr[mid]){
            //case a: on left side 
            if(arr[si]<=tar && tar <=arr[mid]){
                return Search(arr,tar,si,mid-1);
            }
            //case b: on Right side
            else{
                return Search(arr,tar,mid+1,ei);
            }
        }

        //mid on L2
        else{

            // case c: on right
            if(arr[mid] <= tar && tar <=arr[ei]){
                return Search(arr,tar,mid+1,ei);
            }
            // case d: on left
            else{
                return Search(arr,tar,si,mid-1);
            }
        }

    }
    public static void main(String[] args){
        int arr[]={4,5,6,7,0,1,2};
        int tar=0;
        System.out.println(Search(arr,tar,0,arr.length-1));
    }
}
