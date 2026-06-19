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
//Transposing The Matrix
vector<vector<int>> transpose_matrix(vector<vector<int>> &matrix,int rows,int col){
    vector<vector<int>> transpose(col,vector<int>(rows));
    for(int i = 0;i < col;i++){
        for(int j = 0;j < rows;j++) transpose[i][j] = matrix[j][i];
    }
    return transpose;
}
int main(){
    int rows,col;
    cin >> rows >> col;
    //Input Validation
    if(rows <= 0 || col <= 0){
        cout << "Invalid Input";
        return 0;
    }
    vector<vector<int>> matrix(rows,vector<int>(col));
    //Performing Necessary Actions By Calling The Functions
    input_array(matrix,rows,col);
    vector<vector<int>> transposed_matrix = transpose_matrix(matrix,rows,col);
    display_matrices(transposed_matrix,col,rows);
    return 0;
}