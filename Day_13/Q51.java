import java.util.*;
class Q51{
    //Input The Array
    static void input_array(int arr[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < n;i++) arr[i] = sc.nextInt();
    }
    //Finding The Maximum Element Of The Array
    static int max_array(int arr[],int n){
        int max = arr[0];
        for(int i = 0;i < n;i++){
        if(arr[i] > max) max = arr[i]; 
        }   
        return max;
    }
    //Finding The Minimum Element Of The Array
    static int min_array(int arr[],int n){
        int min = arr[0];
        for(int i = 0;i < n;i++){
        if(arr[i] < min) min = arr[i]; 
        }   
        return min;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Input Validation
        if(n <= 0){
            System.out.print("Invalid Input");
        }
        else{
            int arr[] = new int[n];
            //Performing Required Actions By Calling The Functions
            input_array(arr, n);
            System.out.println(max_array(arr, n));
            System.out.print(min_array(arr, n));
        }
        sc.close();
    }
}