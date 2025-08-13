import java.util.HashMap;
import java.util.LinkedList;
import java.util.ArrayList;
public class FunctionImplementation{

    public static class hashMap<K,V>{
        private class Node{
            K key;
            V value;

            Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;

        @SuppressWarnings("Unchecked")
        private LinkedList<Node> buckets[];

        @SuppressWarnings("Unchecked")
        //hashMap constructor
        hashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0;i<4;i++){
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){ //it will return bi ->tell the index in array
            int hc = key.hashCode(); //it will return any value e.g 123575 or -123578
            return Math.abs(hc) % buckets.length;
        }

        private int SearchInLL(K key,int bi){
            LinkedList<Node> ll = buckets[bi];
            int di =0;
            for(int i=0;i<ll.size();i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                else{
                    di++;
                }
            }
            return -1;
        }

        public void put(K key,V value){  //O(lambda) ->O(1)
            int bi = hashFunction(key);
            int di = SearchInLL( key,bi);

                if(di!=-1){
                    Node node = buckets[bi].get(di);
                    node.value=value;
                } else{
                    buckets[bi].add(new Node(key,value));
                    n++;
                }   

                double lambda = n/N;
                if(lambda > 2.0){
                    rehash();
                }
        }

        public boolean containsKey(K key){// O(1)
            int bi = hashFunction(key);
            int di = SearchInLL( key,bi);

                if(di!=-1){
                    return true;
                } else{
                    return false;
                }   
        }

        public  V remove(K key){  //O(1)
            int bi = hashFunction(key);
            int di = SearchInLL( key,bi);

                if(di!=-1){
                    Node node = buckets[bi].remove(di);
                    n--;
                    return node.value;
                } else{
                    return null;
                }   

        }

        public V get(K key){ //O(1)
            int bi = hashFunction(key);
            int di = SearchInLL( key,bi);

                if(di!=-1){
                    Node node = buckets[bi].get(di);
                    return node.value;
                } else{
                    return null;
                }   
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll =buckets[i];
                for(Node node :ll ){
                    keys.add(node.key);
                }
            }
            return keys;      
        }

        public boolean isEmpty(){
            return n ==0;  
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuk[] = buckets; //storing current array of linked list in another array
            buckets =new LinkedList[N*2];  //changing size of array -> arr =new int[N*2]
            N = N*2;

            for(int i=0;i<buckets.length;i++){ 
                buckets[i] = new LinkedList<>(); //in array of linked list at each index assigning empyt linked list
            }

            for(int i=0;i<oldBuk.length;i++){
                LinkedList<Node> ll = oldBuk[i];
                for(int j=0;j<ll.size();j++){
                    Node node = ll.remove();
                    put(node.key,node.value);
                }
            }
        }

        
    }

    public static void main(String[] args){
        hashMap<String,Integer> hm = new hashMap<>();
        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("US", 50);
        hm.put("nepal", 5);

        ArrayList<String> keys = (ArrayList<String>) hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }


    }

   
}