import java.util.*;
class Q77{
    static Scanner sc = new Scanner(System.in);
    //Input The Matrix
    static void input_2D_array(int arr[][],int row,int col){
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++) arr[i][j] = sc.nextInt();
        }
    }
    //Display The Matrix
    static void display_2D_array(int arr[][],int row,int col){
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++) System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }
    //Matrix Multiplication
    static int[][] matrix_multiply(int matrix1[][],int row1,int col1,int matrix2[][],int row2,int col2){
        int multiplied_matrix[][] = new int[row1][col2];
        for(int i = 0;i < row1;i++){
            for(int j = 0;j < col2;j++){
                for(int k = 0;k < col1;k++) multiplied_matrix[i][j] += (matrix1[i][k]*matrix2[k][j]);
            }
        }
        return multiplied_matrix;
    }
    public static void main(String[] args){
        int row1 = sc.nextInt();
        int row2 = sc.nextInt();
        int col1 = sc.nextInt();
        int col2 = sc.nextInt();
        //Input Validation
        if(row1 <= 0 || col1 <= 0 || row2 <= 0 || col2 <= 0){
            System.out.print("Invalid Input");
        }
        else if(col1 != row2) System.out.print("Multiplication Not Possible For This Order");
        else{
            int matrix1[][] = new int[row1][col1];
            int matrix2[][] = new int[row2][col2];
            int multiplied_matrix[][] = new int[row1][col2];
            input_2D_array(matrix1, row1, col1);
            input_2D_array(matrix2, row2, col2);
            multiplied_matrix = matrix_multiply(matrix1,row1,col1,matrix2,row2,col2);
            //Result Printing
            display_2D_array(multiplied_matrix, row1, col2);
        }
        sc.close();
    }
}
