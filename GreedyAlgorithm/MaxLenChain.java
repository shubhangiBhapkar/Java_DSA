package GreedyAlgorithm;
import java.util.*;
import java.util.Comparator;

public class MaxLenChain {
    public static void main(String args[]){
        int pairs[][] = {{5,24},{29,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1];
        for(int i= 1;i<pairs.length;i++) {
            if(pairs[i][0] > chainEnd ){ //last selected pair end /chainend
            chainLen++;
            chainEnd = pairs[i][1];
        }
    }
     System.out.println("Length of chain "+chainLen);
    }
   
}
