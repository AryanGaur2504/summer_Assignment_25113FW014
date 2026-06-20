import java.util.*;
class Q80{
    static Scanner sc = new Scanner(System.in);
    //Input The Matrix
    static void input_2D_array(int arr[][],int row,int col){
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++) arr[i][j] = sc.nextInt();
        }
    }
    //Display The Matrix
    static void display_array(int arr[],int n){
        for(int i = 0;i < n;i++) System.out.print(arr[i] + "\t");
    }
    //Column Wise Summation
    static int[] col_wise_sum(int matrix[][],int row,int col){
        int col_sum[] = new int[col];
        for(int i = 0;i < col;i++){
            int sum = 0;
            for(int j = 0;j < row;j++){
                sum += matrix[j][i];
            }
            col_sum[i] = sum;
        }
        return col_sum;
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
            input_2D_array(matrix, row,col);
            //Result Printing
            display_array(col_wise_sum(matrix,row,col),col);
        }
        sc.close();
    }
}
