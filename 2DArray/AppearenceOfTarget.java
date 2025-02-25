public class AppearenceOfTarget {
    public static int Search(int[][] matrix, int key) {
        int count = 0;
        int row = 0, col = matrix[0].length; // Start from top-right corner

        for( row=0;row<matrix.length;row++){
            for( col=0;col<matrix[0].length;col++){
                if(matrix[row][col]==key){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {4, 7, 8},
            {8, 8, 7}
        };
        int key = 4;
        System.out.println(Search(matrix, key));  // Expected output: 2
    }
}
