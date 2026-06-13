import java.util.*;
class Q52{
    //Input The Array
    static void input_array(int arr[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < n;i++) arr[i] = sc.nextInt();
    }
    //Calculating Number Of Even Elements In The Array
    static int even_array(int arr[],int n){
        int even = 0;
        for(int i = 0;i < n;i++){
        if(arr[i] % 2 == 0) even++; 
        }   
        return even;
    }
    //Calculating Number Of Even Elements In The Array
    static int odd_array(int arr[],int n){
        int odd = 0;
        for(int i = 0;i < n;i++){
        if(arr[i] % 2 != 0) odd++; 
        }   
        return odd;
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
            System.out.println(even_array(arr, n));
            System.out.print(odd_array(arr, n));
        }
        sc.close();
    }
}