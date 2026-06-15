import java.util.*;
class Q59{
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
    //Left Rotate By 'd'
    static void rotate_left_by_d(int arr[],int n,int d){
        d = d % n;
        reverse_array(arr,0,d-1);
        reverse_array(arr,d,n-1);
        reverse_array(arr,0,n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        if(n <= 0 || d < 0) System.out.print("Invalid Input");
        else{
            int arr[] = new int[n];
            // Calculating Left Shifts Equivalent From Right Shift
            int left_shift_equivalent = n-d;
            //Performing Required Tasks By Calling The Functions
            input_arr(arr,n,sc);
            rotate_left_by_d(arr,n,left_shift_equivalent);
            display_arr(arr, n);
        }
        sc.close();
    }
}