public class Subset{
    public static void findSubsets(String str,int i,String ans){
        //Base
        if(i==str.length()){
            if(0==ans.length()){
                System.out.println("null");
            }
            else{
                System.out.println(ans+"");
            }
            return;
        }

        //Recurssion
        //yes choise
        findSubsets(str,i+1,ans+str.charAt(i));

        //no choice
        findSubsets(str, i+1, ans);
    }
    public static void main(String[] args) {
        String str="abc";
        findSubsets(str,0,"");
    }
}