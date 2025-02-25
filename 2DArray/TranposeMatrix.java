import java.util.Arrays;

public class TranposeMatrix {
    public static int[][] getTranspose(int[][] matrix){
        int row=matrix.length;
        int col=matrix[0].length;
        int temp[][]=new int[2][3];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                temp[i][j]=matrix[i][j];
                
            }
        }
        return temp;
    }
    public static void main(String[] args){
        int matrix[][]={
            {1,2,3},
            {4,5,6}
        };
        System.out.println(Arrays.deepToString(getTranspose(matrix)));
    }
}
