import java.util.Scanner;

class Q61{

    //Input Size
    static int input_size(Scanner sc){

        int n;

        do{

            System.out.print("Enter Size : ");
            n = sc.nextInt();

            if(n <= 0){
                System.out.println("Invalid Size");
            }

        }while(n <= 0);

        return n;

    }

    //Input Array
    static void input_array(int arr[],Scanner sc){

        System.out.println("Enter Elements");

        for(int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }

    }

    //Finding Missing Number
    static int find_missing(int arr[],int n){

        int sum = 0;

        int actual_sum = (n*(n+1))/2;

        for(int i = 0;i < arr.length;i++){
            sum += arr[i];
        }

        return actual_sum - sum;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = input_size(sc);

        int arr[] = new int[n-1];

        input_array(arr,sc);

        System.out.println("Missing Number : " + find_missing(arr,n));

        sc.close();

    }
}