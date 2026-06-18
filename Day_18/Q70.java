import java.util.*;
class Q70{
    static Scanner sc = new Scanner(System.in);
    //Input The Array Elements
    static void input_arr(int arr[],int n){
        for(int i = 0;i < n;i++) arr[i] = sc.nextInt();
    }
    //Display The Array
    static void display_arr(int arr[],int n){
        for(int i = 0;i < n;i++) System.out.print(arr[i] + "\t");
    }
    //Performing Selection Sort
    static void selection_sort(int arr[],int n){
            for(int i = 0;i < n-1;i++){
                int min = i;
                for(int j = i + 1;j < n;j++){
                    if(arr[j] < arr[min]) min = j;  
                }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
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
            selection_sort(arr, n);
            display_arr(arr, n);
        }
    }
    sc.close();
}