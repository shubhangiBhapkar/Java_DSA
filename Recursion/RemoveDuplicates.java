public class RemoveDuplicates {
    public static void removeDuplicates(String str,int idex,StringBuilder newstr,boolean map[]){
       //base
        if(idex==str.length()){
            System.out.println(newstr);
            return ;
        }
        //kaam
        char currChar = str.charAt(idex);
        if(map[currChar-'a']==true){
            removeDuplicates(str, idex+1, newstr, map);
        }else{
            map[currChar-'a']=true;
            removeDuplicates(str, idex+1, newstr.append(currChar), map);
        }
    }

    public static void main(String[] args){
        String str = "appnnacollege";
        removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
    }
}
