import java.util.*;
class Q56{
    //Input The Array
    static void input_array(int arr[],int n,Scanner sc){
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }   
    }
    //Finding Duplicate Elements
    static void duplicate_elements(int arr[],int n){
        for(int i = 0;i <= n-1;i++){
            for(int j = i+1;j <= n-1;j++){
                if(arr[j] == arr[i]){
                    System.out.print(arr[j] + "\t");
                    break;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Input Validation
        if(n <= 0){
            System.out.print("Invalid Input");
        }
        //Performing Required Actions By Calling The Functions
        else{
             int arr[] = new int[n];
             input_array(arr,n,sc);
             duplicate_elements(arr, n);
        }
        sc.close();
    }
}