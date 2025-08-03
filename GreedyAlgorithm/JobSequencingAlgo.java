package GreedyAlgorithm;
import java.util.*;
public class JobSequencingAlgo {
    public static class Job{
        int deadLine;
        int profit;
        int id;

        public Job(int i,int d,int p){
            deadLine = d;
            profit = p;
            id = i;
        }
    }
    public static void main(String[] args){
        int jobInfo[][] = {{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0;i<jobInfo.length;i++){
            jobs.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
        }

        Collections.sort(jobs,(obj1,obj2)-> obj2.profit - obj1.profit); //decending order sort

        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;
        for(int i=0;i<jobs.size();i++){
            Job curr = jobs.get(i);
            if(curr.deadLine > time){
                seq.add(curr.id);
                time++;
            }

        }

        System.out.println("max job "+seq.size());
        for(int i=0;i<jobs.size();i++){
            System.out.print(seq.get(i)+ " ");
        }
    }

}

