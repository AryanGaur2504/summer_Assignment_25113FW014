import java.util.*;
class Q55{
    //Input The Array
    static void input_array(int arr[],int n,Scanner sc){
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }   
    }
    //Finding Second Largest Element
    static int second_largest(int arr[],int n){
        int larg = arr[0];
        int slarg = -1; //Assuming All +ve
        for(int i = 1;i < n;i++){
            if(arr[i] > larg){
                slarg = larg;
                larg = arr[i];
            }
            else if(arr[i] < larg && arr[i] > slarg) slarg = arr[i];
        }
        return slarg;
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
             System.out.print(second_largest(arr,n));
        }
        sc.close();
    }
}