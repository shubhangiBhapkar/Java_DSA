package GreedyAlgorithm;

import java.util.*;
public class MaxActivity {
    public static void main(String args[]){
         int start[] = {1,3,0,5,8,5};
         int end[] = {2,4,6,7,9,9};

        //if the end array is not given in sorted order
        int Activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            Activities[i][0] = i;
            Activities[i][1] =start[i];
            Activities[i][2] =end[i];
        }

        Arrays.sort(Activities,Comparator.comparingDouble(o -> o[2]));
        //sort the end array
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(0);

        int lastEnd = Activities[0][2];
        //overlapping
        for(int i=1;i<end.length;i++){
            if(Activities[i][1] >= lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd = Activities[i][2];
            }
        }
        System.out.println(maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.println("A "+ ans.get(i));
        }
        System.out.println();
    }
}
