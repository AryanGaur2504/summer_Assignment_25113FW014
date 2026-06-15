import java.util.*;
class Q57{
    //Input The Array Elements
    static void input_arr(int arr[],int n,Scanner sc){
        for(int i = 0;i < n;i++) arr[i] = sc.nextInt();
    }
    //Display The Array
    static void display_arr(int arr[],int n){
        for(int i = 0;i < n;i++) System.out.print(arr[i] + "\t");
    }
    //Reverse The Array
    static void reverse_array(int arr[],int strt,int end){
        while(strt < end){
            int temp = arr[strt];
            arr[strt] = arr[end];
            arr[end] = temp;
            strt++;
            end--;
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
            reverse_array(arr, 0, n-1);
            display_arr(arr, n);
        }
        sc.close();
    }
}