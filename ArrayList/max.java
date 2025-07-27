package ArrayList;
import java.util.ArrayList;

public class max {
    public static void main(String args[]){

    ArrayList <Integer> var1=new ArrayList<>();
    var1.add(7);
    var1.add(4);
    var1.add(10);
    var1.add(67);
    var1.add(2);
    
    int max=Integer.MIN_VALUE;
    for(int i=0;i<var1.size();i++){
        
        max=Math.max(max,var1.get(i));
    }
    System.out.println("maximum element = "+ max);
}
}