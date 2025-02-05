import java.util.Scanner;

public class MaxAndMin {
    public static void FindMax(int[][] matrix){
        int max=matrix[0][0];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
        }
        System.out.println("Max Element :"+max);
    }

    public static void FindMin(int[][] matrix){
        int min=matrix[0][0];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
        }
        System.out.println("Min Element :"+min);
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;

        //accepting elements
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //disply elements
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

      FindMax(matrix);
      FindMin(matrix);
    }
}

    

