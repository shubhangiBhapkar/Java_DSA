import java.util.*;
class MajorityElement{
    public static void main(String[] args){
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[] = {1,3,2,5,1,3,1,5,1};

        for(int i=0;i<arr.length;i++){
        //     int num = arr[i];
        //     if(map.containsKey(num)){
        //         map.put(num,map.get(num)+1);
        //     }
        //     else{
        //         map.put(num,1);
        //     }
        // }

        map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        //iterate the map
        //Set<Integer> keySet = map.keySet(); 
        for (Integer key : map.keySet()) {
            if(map.get(key) > arr.length/3){
                System.out.println(key);
            }
            
        }
    }
}