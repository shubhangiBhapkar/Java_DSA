class MergeSortOnString{

    public static String[] mergeSort(String[] arr,int si,int ei ){
        if(si==ei){
            String A[]={arr[si]};
            return A;
        }

        int mid=(si+ei)/2;
        String arr1[]=mergeSort(arr, si, mid);
        String arr2[]=mergeSort(arr, mid+1, ei);

        String arr3[]=merge(arr1,arr2);
        return arr3;
    }
    public static String[] merge(String[] arr1,String[] arr2){
       int m=arr1.length;
       int n=arr2.length;

       String arr3[]=new String[m+n];
       int i=0;
       int j=0;
       int k=0;

       while(i<m && j<n){
            if(isAlphabeticallySmaller(arr1[i],arr2[j])){
                arr3[k]=arr1[i];
                i++;
                k++;
            }else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
       }
       while(i<m){
        arr3[k++]=arr1[i++];
       }
       while(j<n){
        arr3[k++]=arr1[j++];
       }

       return arr3;
    }

    public static boolean isAlphabeticallySmaller(String str1,String str2){
        if(str1.compareTo(str2)<0) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        String arr[]={"sun","earth","marse","jupiter"};
       String A[]= mergeSort(arr,0,arr.length-1);
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}