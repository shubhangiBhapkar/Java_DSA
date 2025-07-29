public class StrLength {
    static int len;
    public static int getLength(String str){

        if(str.length()==0){
            return len;
        }

        getLength(str);
        len++;
        return len;
    }
    public static void main(String[] args){
        getLength("shub");
    }
}
