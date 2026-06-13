import java.util.*;
class Q50{
    //Input The Array
    static void input_array(int arr[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < n;i++) arr[i] = sc.nextInt();
    }
    //Calculating Sum Of The Array Elements
    static int sum_array(int arr[],int n){
        int sum = 0;
        for(int i = 0;i < n;i++){
        sum += arr[i]; 
        }   
        return sum;
    }
    //Calculating Average Of The Array Elements
    static double avg_array(int arr[],int n){
        double avg = ((double)sum_array(arr,n))/n;
        return avg;
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
            System.out.println(sum_array(arr, n));
            System.out.print(avg_array(arr, n));
        }
        sc.close();
    }
}