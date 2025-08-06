import java.util.PriorityQueue;

public class SlidingWindowMax {
    public static class Pair implements Comparable<Pair>{
        int val;
        int idx;
        public Pair(int val,int idx) {
            this.val = val;
            this.idx = idx;
        }
        public int compareTo(Pair p2){
            //desending order
            return p2.val - this.val;
        }

    }
    public static void main(String args[]){
        int arr[] ={1,3,-1,-3,5,3,6,7};
        int k = 3;
        int res[] = new int[arr.length -k+1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        //1st window
        for(int i=0;i<k;i++){
            pq.add(new Pair(arr[i],i)); //in pRiority q we add val and idx for 3 ele(window size)
        }

        res[0] = pq.peek().val; //storing max value in res from window

        for(int i=k;i<arr.length;i++){  //for selecting the next windows
            while(pq.size()>0 && pq.peek().idx <= (i-k)) {
                pq.remove();  //removed the ele which came before the window
            }

            pq.add(new Pair(arr[i],i)); //adding current ele in pq

            res[i-k+1] = pq.peek().val; //i-k+1 index in res array to insert ele
        }
        //print the result
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }

    }
}
