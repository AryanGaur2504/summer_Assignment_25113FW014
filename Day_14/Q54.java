import java.util.*;
class Q54{
    //Input The Array
    static void input_array(int arr[],int n,Scanner sc){
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }   
    }
    //Finding Frequency Of Element (n --> Size,x --> Element)
    static int frequency(int arr[],int n,int x){
       int hash[] = new int[1000000];// 0 <= x <= 10^6
        for(int i = 0;i <= n-1;i++){
            hash[arr[i]]++;
        }
        //Fetching
        return hash[x];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        //Input Validation
        if(n <= 0){
            System.out.print("Invalid Input");
        }
        //Performing Required Actions By Calling The Functions
        else{
             int arr[] = new int[n];
             input_array(arr,n,sc);
             System.out.print(frequency(arr,n,x));
        }
        sc.close();
    }
}