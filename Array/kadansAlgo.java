public class kadansAlgo {
    public static void printMax(int num[]){
        boolean flag=false;
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<=num.length;i++){
            if(i>=0){
                flag=true;
            }
        }      
        if(flag=true){
            System.out.println("negative array");
            //find smallest smallest negative value print
        }else{
        for(int i=0;i<num.length;i++){
            cs+=num[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);       
        }
        System.out.println(ms);
    }
    }
    public static void main(String a[]){
        //int num[]={-2,-3,4,-1,-2,1,5,-3};
        int num[]={-2,-3,-4,-1,-2,-1,-5,-3};
        printMax(num);

    }
}
