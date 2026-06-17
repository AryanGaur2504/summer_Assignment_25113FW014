import java.util.Scanner;

class Q66{

    static Scanner sc = new Scanner(System.in);

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

    //Check Element Present
    static boolean is_present(int arr[],int size,int target){

        for(int i = 0;i < size;i++){
            if(arr[i] == target){
                return true;
            }
        }

        return false;
    }

    //Union Of Arrays
    static int[] union_array(int arr1[],int arr2[]){

        int temp[] = new int[arr1.length + arr2.length];

        int index = 0;

        //Insert First Array
        for(int i = 0;i < arr1.length;i++){
            temp[index++] = arr1[i];
        }

        //Insert Unique Elements
        for(int i = 0;i < arr2.length;i++){

            if(is_present(temp,index,arr2[i]) == false){
                temp[index++] = arr2[i];
            }
        }

        int uni[] = new int[index];

        for(int i = 0;i < index;i++){
            uni[i] = temp[i];
        }

        return uni;
    }

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

        int uni[] = union_array(arr1,arr2);

        System.out.print("Union Array : ");
        display_array(uni);
    }
    sc.close();
}
