import java.util.*;
class Q76{
    static Scanner sc = new Scanner(System.in);
    //Input The Matrix
    static void input_2D_array(int arr[][],int row,int col){
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++) arr[i][j] = sc.nextInt();
        }
    }
    //Display The Matrix
    static void display_array(int arr[],int n){
        for(int j = 0;j < n;j++) System.out.print(arr[j] + "\t");
    }
    //Diagonal Sum
    static int[] diagonal_sum(int arr[][],int n){
        int primary_diag_sum = 0;
        int secondary_diag_sum = 0;
        int total_sum;
        for(int i = 0;i < n;i++){
            primary_diag_sum+= arr[i][i];
            secondary_diag_sum+= arr[i][n-i-1];
        }
        total_sum = primary_diag_sum + secondary_diag_sum;
        if(n % 2 != 0) total_sum-= arr[n/2][n/2];
        int diagonal_summation[] = {total_sum,primary_diag_sum,secondary_diag_sum};
        return diagonal_summation;
    }
    public static void main(String[] args){
        int n = sc.nextInt();
        //Input Validation
        if(n <= 0){
            System.out.print("Invalid Input");
        }
        else{
            int matrix[][] = new int[n][n];
            int diagonal_summation[] = new int[3];
            input_2D_array(matrix, n, n);
            diagonal_summation = diagonal_sum(matrix,n);
            display_array(diagonal_summation,n);
        }
    }
}
