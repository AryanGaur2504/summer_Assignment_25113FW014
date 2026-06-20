#include <bits/stdc++.h>
using namespace std;
    //Input The Matrix
    void input_2D_array(vector<vector<int>> &arr,int row,int col){
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++) cin >> arr[i][j];
        }
    }
    //Display The Matrix
    void display_array(vector<int> &arr,int n){
        for(int i = 0;i < n;i++) cout << arr[i] << "\t";
    }
    //Column Wise Summation
    vector<int> col_wise_sum(vector<vector<int>> &matrix,int row,int col){
        vector<int> col_sum(col);
        for(int i = 0;i < col;i++){
            int sum = 0;
            for(int j = 0;j < row;j++){
                sum += matrix[j][i];
            }
            col_sum[i] = sum;
        }
        return col_sum;
    }
    int main(){
        int row,col;
        cin >> row >> col;
        //Input Validation
        if(row <= 0 || col <= 0){
            cout << "Invalid Input";
            return 0;
        }
            vector<vector<int>> matrix(row,vector<int>(col));
            input_2D_array(matrix, row, col);
            //Result Printing
            vector<int> col_sum = col_wise_sum(matrix,row,col);
            display_array(col_sum,col);
            return 0;
        }
