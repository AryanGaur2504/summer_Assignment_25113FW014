import java.util.Scanner;

class Q65{

    static void input_array(int arr[],int n){
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
    }

    static void display_array(int arr[]){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    //Merge Two Arrays
    static int[] merge_arrays(int arr1[],int arr2[]){
        int merged[] = new int[arr1.length + arr2.length];

        int index = 0;

        //Insert First Array
        for(int i = 0;i < arr1.length;i++){
            merged[index++] = arr1[i];
        }

        //Insert Second Array
        for(int i = 0;i < arr2.length;i++){
            merged[index++] = arr2[i];
        }

        return merged;
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){

        System.out.print("Enter Size Of First Array : ");
        int n1 = sc.nextInt();

        int arr1[] = new int[n1];

        System.out.print("Enter Elements Of First Array : ");
        input_array(arr1,n1);

        System.out.print("Enter Size Of Second Array : ");
        int n2 = sc.nextInt();

        int arr2[] = new int[n2];

        System.out.print("Enter Elements Of Second Array : ");
        input_array(arr2,n2);

        int merged[] = merge_arrays(arr1,arr2);

        System.out.print("Merged Array : ");
        display_array(merged);
    }
    sc.close();
}
