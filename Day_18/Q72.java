import java.util.*;
class Q72{
    static Scanner sc = new Scanner(System.in);
    //Input The Array Elements
    static void input_arr(int arr[],int n){
        for(int i = 0;i < n;i++) arr[i] = sc.nextInt();
    }
    //Display The Array
    static void display_arr(int arr[],int n){
        for(int i = 0;i < n;i++) System.out.print(arr[i] + "\t");
    }
    //Performing Reverse Bubble Sort For Descending
    static void bubble_sort(int arr[],int n){
        for(int i = 0;i < n-1;i++){
            int swapped = 0;
            for(int j = 0;j < n-i-1;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped++;
                } 
            }
            //To Stop If Array Sorts Before Complete Iteration
            if(swapped == 0) return;
    }
    }
    public static void main(String[] args){
        int n = sc.nextInt();
        //Input Validation
        if(n <= 0) System.out.print("Invalid Input");
        else{
            int arr[] = new int[n];
            //Performing Required Tasks By Calling The Functions
            input_arr(arr,n);
            bubble_sort(arr, n);
            display_arr(arr, n);
        }
    }
}