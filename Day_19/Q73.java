import java.util.*;
class Q73{
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
    //Matrix Addition
    static int[][] matrix_addition(int matrix1[][],int matrix2[][],int row,int col){
        int summation_matrix[][] = new int[row][col];
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                summation_matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return summation_matrix;
    }
    public static void main(String[] args){
        int row = sc.nextInt();
        int col = sc.nextInt();
        //Input Validation
        if(row <= 0 || col <= 0){
            System.out.print("Invalid Input");
        }
        else{
            int matrix1[][] = new int[row][col];
            int matrix2[][] = new int[row][col];
            int summation[][] = new int[row][col];
            input_2D_array(matrix1, row, col);
            input_2D_array(matrix2, row, col);
            summation = matrix_addition(matrix1, matrix2, row, col);
            display_2D_array(summation, row, col);
        }
    }
}