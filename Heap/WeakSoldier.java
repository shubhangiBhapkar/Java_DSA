import java.util.Comparator;
import java.util.PriorityQueue;
public class WeakSoldier {
   
    public static class Row implements Comparable<Row> {
        int soldier;
        int idx;

        public Row(int soldier,int idx){
            this.soldier = soldier;
            this.idx = idx;
        }

        public int compareTo(Row r2) {
            if(this.soldier == r2.soldier) {
                return this.idx - r2.idx;
            }
            else{
                return this.soldier - r2.soldier;
            }
        }
    }
    public static void main(String[] args) {
         int k=2;
        int army[][] = {
            {1,0,0,0},
            {1,1,1,1,},
            {1,0,0,0},
            {1,0,0,0}
        };
        PriorityQueue<Row>pq = new PriorityQueue<>();
        for(int i=0;i<army.length;i++) {
            int count = 0;
            for(int j=0;j<army[0].length;j++){
                count += army[i][j] == 1 ? 1 : 0;              
            }
            pq.add(new Row(count,i));
        }
        for(int i=0;i<k;i++){
        System.out.println("R"+pq.remove().idx); //.idx to print index or it will print  object
    }
    }
    
    
}