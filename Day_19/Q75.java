import java.util.*;
class Q75{
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
    //Matrix Transpose
    static int[][] matrix_transpose(int matrix[][],int row,int col){
        int transposed_matrix[][] = new int[row][col];
        for(int i = 0;i < col;i++){
            for(int j = 0;j < row;j++){
                transposed_matrix[i][j] = matrix[j][i];
            }
        }
        return transposed_matrix;
    }
    public static void main(String[] args){
        int row = sc.nextInt();
        int col = sc.nextInt();
        //Input Validation
        if(row <= 0 || col <= 0){
            System.out.print("Invalid Input");
        }
        else{
            int matrix[][] = new int[row][col];
            int transposed_matrix[][] = new int[col][row];
            input_2D_array(matrix, row, col);
            transposed_matrix = matrix_transpose(matrix, row, col);
            display_2D_array(transposed_matrix, col, row);
        }
    }
}
