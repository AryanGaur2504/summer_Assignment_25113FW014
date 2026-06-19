#include <bits/stdc++.h>
using namespace std;
//Input The 2D-Array
void input_array(vector<vector<int>> &arr,int rows,int col){
    for(int i = 0;i < rows;i++){
        for(int j = 0;j < col;j++) cin >> arr[i][j];
    }
}
//Display The 2D-Array
void display_matrices(vector<vector<int>> &arr,int rows,int col){
    for(int i = 0;i < rows;i++){
        for(int j = 0;j < col;j++) cout << arr[i][j] << "\t";
        cout << endl;
    }
}
//Adding The Matrices
vector<vector<int>> matrix_sum(vector<vector<int>> &matrix1,vector<vector<int>> &matrix2,int rows,int col){
    vector<vector<int>> summation(rows,vector<int>(col));
    for(int i = 0;i < rows;i++){
        for(int j = 0;j < col;j++) summation[i][j] = matrix1[i][j] + matrix2[i][j];
    }
    return summation;
}
int main(){
    int rows,col;
    cin >> rows >> col;
    //Input Validation
    if(rows <= 0 || col <= 0){
        cout << "Invalid Input";
        return 0;
    }
    vector<vector<int>> matrix1(rows,vector<int>(col));
    vector<vector<int>> matrix2(rows,vector<int>(col));
    //Performing Necessary Actions By Calling The Functions
    input_array(matrix1,rows,col);
    input_array(matrix2,rows,col);
    vector<vector<int>> summation_matrix = matrix_sum(matrix1,matrix2,rows,col);
    display_matrices(summation_matrix,rows,col);
    return 0;
}