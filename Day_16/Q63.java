import java.util.Scanner;

class Q63{

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

    //Finding Pair
    static void pair_sum(int arr[],int target){

        boolean found = false;

        for(int i = 0;i < arr.length;i++){

            for(int j = i + 1;j < arr.length;j++){

                if(arr[i] + arr[j] == target){

                    System.out.println("Pair Found : " + arr[i] + " " + arr[j]);

                    found = true;

                }

            }

        }

        if(found == false){
            System.out.println("No Pair Found");
        }

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = input_size(sc);

        int arr[] = new int[n];

        input_array(arr,sc);

        System.out.print("Enter Target : ");
        int target = sc.nextInt();

        pair_sum(arr,target);

        sc.close();
    }
}