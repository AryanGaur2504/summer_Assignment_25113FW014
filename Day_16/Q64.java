import java.util.Scanner;

class Q64{

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

    //Removing Duplicates
    static int remove_duplicates(int arr[],int temp[]){

        int k = 0;

        for(int i = 0;i < arr.length;i++){

            boolean duplicate = false;

            for(int j = 0;j < k;j++){

                if(arr[i] == temp[j]){
                    duplicate = true;
                    break;
                }

            }

            if(duplicate == false){
                temp[k] = arr[i];
                k++;
            }

        }

        return k;

    }

    //Printing Array
    static void print_array(int temp[],int size){

        for(int i = 0;i < size;i++){
            System.out.print(temp[i] + " ");
        }

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = input_size(sc);

        int arr[] = new int[n];

        int temp[] = new int[n];

        input_array(arr,sc);

        int size = remove_duplicates(arr,temp);

        System.out.print("Array After Removing Duplicates : ");

        print_array(temp,size);

        sc.clsoe();
    }
}