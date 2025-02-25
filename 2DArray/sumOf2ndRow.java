public class sumOf2ndRow {
    public static int getSum(int[][] matrix){
        int sum=0;
        int i=1;
            for(int j=0;j<matrix[0].length;j++){
                sum+=matrix[i][j];
                        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };
        System.out.println(getSum(matrix));
    }
}
