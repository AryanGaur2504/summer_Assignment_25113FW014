import java.util.*;
class Q53{
    //Input The Array
    static void input_array(int arr[],int n,Scanner sc){
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }   
    }
    //Finding Element (n --> Size,x --> Element To Be Found)
    static int linear_search(int arr[],int n,int x){
        for(int i = 0;i <= n-1;i++){
            if(arr[i] == x) return i; //Returns Index At Which Element Is Present
        }
        return -1;//If Element Is Not Found
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
             System.out.print(linear_search(arr,n,x));
        }
        sc.close();
    }
}