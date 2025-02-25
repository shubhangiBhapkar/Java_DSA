public class DiagonalSum {
    public static int Sum(int[][] matrix){
        int sum=0;
        // for(int i=0;i<matrix.length;i++){ //O(n2)
        //     for(int j=0;j<matrix[0].length;j++){
        //         //PD
        //         if(j==i){
        //             sum+=matrix[i][j];
        //         }
        //         //DS
        //         else{
        //             if(i+j==matrix.length-1){
        //             sum+=matrix[i][j];
        //             }
        //         }
        //     }
        // }

        for(int i=0;i<matrix.length;i++){
            // PD 
            sum+=matrix[i][i];
            //SD
            if(i!=matrix.length-1-i)
                sum+=matrix[i][matrix.length-1-i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println(Sum(matrix));
    }
}
