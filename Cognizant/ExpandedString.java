public class ExpandedString{
    public static void main(String args[]){
        String str = "abcaba";
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=str.length();i++){
           for(int j=1;j<=i;j++){
                sb.append(str.charAt(i-1));
                
           }
           sb.append("-");
        }
        System.out.println(sb);
    }
}
