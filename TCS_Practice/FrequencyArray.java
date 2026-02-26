import java.util.*;

public class FrequencyArray {
    
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      HashMap<Integer,Integer> map = new HashMap<>();
      System.out.println("Enter the number of Elements:");
      int n = sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter array elemts:");{
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
      }
      }
      
      for(int ele:map.keySet()){
        System.out.println("the frequency of "+ele+" in array is "+map.get(ele));
      }
    }
    

}
