public class TailingProblem {
    public static int totalTiles(int n){
            //base
            if(n==0 || n==1){
                return 1;
            }

            //choice vertical
            int fnm1 = totalTiles(n-1);  
            //horizontal choice
            int fnm2 = totalTiles(n-2);
            int totWays = fnm1 + fnm2;
            return totWays;

    }

    public static void main(String[] args){
        System.out.println(4);
    }
}
