public class LargeString {
    public static String getLarge(String[] fruits){
        String large=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(large.compareTo(fruits[i])<0){
                large=fruits[i];
           }
        }
        return large;
    }
    public static void main(String[] args) {
        String fruits[]={"apple","mango","banana"};
        System.out.println(getLarge(fruits));
    }
}
