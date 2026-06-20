#include <bits/stdc++.h>
using namespace std;
    //Input The Matrix
    void input_2D_array(vector<vector<int>> &arr,int row,int col){
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++) cin >> arr[i][j];
        }
    }
    //Display The Matrix
    void display_2D_array(vector<vector<int>> &arr,int row,int col){
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++) cout << arr[i][j] << "\t";
            cout << endl;
        }
    }
    //Matrix Multiplication
    vector<vector<int>> matrix_multiply(vector<vector<int>> &matrix1,int row1,int col1,vector<vector<int>> &matrix2,int row2,int col2){
        vector<vector<int>> multiplied_matrix(row1,vector<int>(col2));
        for(int i = 0;i < row1;i++){
            for(int j = 0;j < col2;j++){
                for(int k = 0;k < col1;k++) multiplied_matrix[i][j] += (matrix1[i][k]*matrix2[k][j]);
            }
        }
        return multiplied_matrix;
    }
    int main(){
        int row1,col1,row2,col2;
        cin >> row1 >> col1 >> row2 >> col2;
        //Input Validation
        if(row1 <= 0 || col1 <= 0 || row2 <= 0 || col2 <= 0){
            cout << "Invalid Input";
            return 0;
        }
        else if(col1 != row2){
            cout << "Multiplication Not Possible For This Order";
            return 0;
        } 
            vector<vector<int>> matrix1(row1,vector<int>(col1));
            vector<vector<int>> matrix2(row2,vector<int>(col2));
            input_2D_array(matrix1, row1, col1);
            input_2D_array(matrix2, row2, col2);
            vector<vector<int>> multiplied_matrix = matrix_multiply(matrix1,row1,col1,matrix2,row2,col2);
            //Result Printing
            display_2D_array(multiplied_matrix, row1, col2);
            return 0;
        }
