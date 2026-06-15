import java.util.*;
class Q60{
    //Input The Array Elements
    static void input_arr(int arr[],int n,Scanner sc){
        for(int i = 0;i < n;i++) arr[i] = sc.nextInt();
    }
    //Display The Array
    static void display_arr(int arr[],int n){
        for(int i = 0;i < n;i++) System.out.print(arr[i] + "\t");
    }
    //Moving The Zeroes To The End
    static void zeroes_to_end(int arr[],int strt,int end){
        int j = 0;
        for(int i = 0;i < n;i++){
        if(arr[i] != 0){
            swap(arr[i],arr[j]);
            j++;
        }
    }
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 0) System.out.print("Invalid Input");
        else{
            int arr[] = new int[n];
            //Performing Required Tasks By Calling The Functions
            input_arr(arr,n,sc);
            zeroes_to_end(arr,n);
            display_arr(arr, n);
        }
        sc.close();
    }
}