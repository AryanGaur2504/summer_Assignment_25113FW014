import java.util.*;
class Q49{
    //Input The Array
    static void input_array(int arr[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < n;i++) arr[i] = sc.nextInt();
    }
    //Displaying The Array
    static void display_array(int arr[],int n){
        for(int i = 0;i < n;i++) System.out.print(arr[i] + "\t");
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
            display_array(arr, n);
        }
        sc.close();
    }
}