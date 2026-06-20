import java.util.*;
class Q78{
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
    //Checking For Symmetric
    static boolean is_Symmetric(int matrix[][],int n){
        for(int i = 0;i <= n/2;i++){
            for(int j = i+1;j < n;j++){
                if(matrix[i][j] != matrix[j][i]) return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int n = sc.nextInt();
        //Input Validation
        if(n <= 0){
            System.out.print("Invalid Input");
        }
        else{
            int matrix[][] = new int[n][n];
            input_2D_array(matrix, n, n);
            //Result Printing
            if(is_Symmetric(matrix,n)) System.out.print("Symmetric Matrix");
            else System.out.print("Not A Symmetric Matrix");
        }
        sc.close();
    }
}
