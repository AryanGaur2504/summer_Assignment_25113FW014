import java.util.*;
class Q71{
    static Scanner sc = new Scanner(System.in);
    //Input The Array Elements
    static void input_arr(int arr[],int n){
        for(int i = 0;i < n;i++) arr[i] = sc.nextInt();
    }
    //Display The Array
    static void display_arr(int arr[],int n){
        for(int i = 0;i < n;i++) System.out.print(arr[i] + "\t");
    }
    //Performing Binary Search
    static int binary_search(int arr[],int n,int x){
            int lb = 0;
            int ub = n-1;
            int mb = (lb + ub)/2;
            while(lb <= ub){
                if(arr[mb] == x) return mb;
                else if(x < arr[mb]){
                    ub = mb - 1;
                    mb = (ub + lb)/2;
                }
                else{
                    lb = mb + 1;
                    mb = (ub + lb)/2;
                }
            }
            return -1;
    }
    public static void main(String[] args){
        int n = sc.nextInt();
        //Input Validation
        if(n <= 0) System.out.print("Invalid Input");
        else{
            int arr[] = new int[n];
            //Performing Required Tasks By Calling The Functions
            input_arr(arr,n);
            int x = sc.nextInt();
            System.out.print(binary_search(arr, n,x));
        }
    }
}