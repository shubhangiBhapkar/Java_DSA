package GreedyAlgorithm;
import java.util.*;
public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] ={2000,500,100,50,20,10,5,2,1};

        Arrays.sort(coins,Comparator.reverseOrder()); //2000 500 100 50 20 10 5 2 1

        ArrayList<Integer> ans = new ArrayList<>();//90 50 20 20

        int count = 0;//1 2 3 4
        int amount = 590;//90 40 20 0
        for(int i=0;i<coins.length;i++) {
            if(coins[i] <= amount) {
                while(coins[i]<=amount){
                    count++;
                    ans.add(coins[i]);
                    amount =amount-coins[i];
                }
               
            }
        }
        System.out.println("Total min Coins used = "+count );
        for(int i=0;i<ans.size();i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}

