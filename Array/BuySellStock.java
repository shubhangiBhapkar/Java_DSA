public class BuySellStock {
    public static int maxProfit(int prices[]){
        // int Buy_Price=Integer.MAX_VALUE;
        // int maxProfit=0;
        // for(int i=0;i<prices.length;i++){
        //     if(Buy_Price<prices[i]){
        //         int profit=prices[i]-Buy_Price;  //Todays profit
        //         maxProfit=Math.max(profit,maxProfit);
        //     }else{
        //         Buy_Price=prices[i];    //loss
        //     }
        // }

        // return maxProfit;



        // class Solution {
        //     public int maxProfit(int[] prices) {
                int Buy_Price=Integer.MAX_VALUE;
                int maxProfit=0;
                for(int i=0;i<prices.length;i++){
                    if(Buy_Price<prices[i]){
                        int profit=prices[i]-Buy_Price;  //Todays profit
                        maxProfit=Math.max(profit,maxProfit);
                    }else{
                        Buy_Price=prices[i];    //loss
                    }
                }
                return maxProfit;
            }
        
    
    public static void main(String[] arg){
        int prices[]={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
        
    }
}
