import java.util.Scanner;

class Q62{

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

    //Finding Maximum Frequency Element
    static int max_frequency(int arr[]){

        int max_freq = 0;

        int ans = arr[0];

        for(int i = 0;i < arr.length;i++){

            int count = 0;

            for(int j = 0;j < arr.length;j++){

                if(arr[i] == arr[j]){
                    count++;
                }

            }

            if(count > max_freq){
                max_freq = count;
                ans = arr[i];
            }

        }

        return ans;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = input_size(sc);

        int arr[] = new int[n];

        input_array(arr,sc);

        System.out.println("Maximum Frequency Element : " + max_frequency(arr));

        sc.close();
    }
}