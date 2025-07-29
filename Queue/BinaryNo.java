//Given a number N. The task is to generate and print all binary numbers with decimal values from
//1 to N.
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;

public class BinaryNo {
    public static ArrayList<String> getBinary(int n){
        ArrayList<String> ans = new ArrayList<>();
        Queue<String> q= new LinkedList<>();

        q.add("1");
        while(n>0){
            String temp = q.remove();

            ans.add(temp);

            q.add(temp + "0");
            q.add(temp + "1");

        }
        return ans;
    }

    public static void main(String args[]){
        BinaryNo b = new BinaryNo();
        System.out.println(b.getBinary(5));
        }
}
