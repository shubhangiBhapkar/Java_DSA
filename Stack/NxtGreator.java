import java.util.*;
public class NxtGreator {
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int greator[] = new int[arr.length];

        for(int i = arr.length-1  ;i>=0;i-- ){
            //1.while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //2.if else
            if(s.isEmpty()){
                greator[i] = -1;
            }else{
                greator[i] = arr[s.peek()];
            }
            //3.push
            s.push(i);
        }

        for(int i=0;i<greator.length;i++){
            System.out.println(greator[i]);
        }
    }
}
