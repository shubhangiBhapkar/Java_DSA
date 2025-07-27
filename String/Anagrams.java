public class Anagrams {
    public static void getAnagrams(String str1,String str2){
        str1.toLowerCase();
        str2.toLowerCase();

        if(str1.length()==str2.length()){
            char[] str1Array=str1.toCharArray();
            char[] str2Array=str2.toCharArray();
            if(str1Array.equals(str2Array)){
                System.out.println(str1 +"  "+ str2 + "are anagrams strings");
            }
            else{
                System.out.println(str1 +"  "+ str2 + "are not anagrams strings");
            }
        }
        else{
            System.out.println(str1 +"  "+ 
            str2 + "are anagrams strings");
        }
        
    } 
    public static void main(String args[]){
        String str1="care";
        String str2="race";
        getAnagrams(str1,str2);
    }
}
