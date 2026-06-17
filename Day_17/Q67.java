import java.util.Scanner;

class Q67{

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

    //Intersection Of Arrays
    static int[] intersection_array(int arr1[],int arr2[]){

        int temp[] = new int[Math.min(arr1.length,arr2.length)];

        int index = 0;

        for(int i = 0;i < arr1.length;i++){

            boolean found = false;

            //Check In Second Array
            for(int j = 0;j < arr2.length;j++){

                if(arr1[i] == arr2[j]){
                    found = true;
                    break;
                }
            }

            //Avoid Duplicate Elements
            if(found == true && is_present(temp,index,arr1[i]) == false){
                temp[index++] = arr1[i];
            }
        }

        int inter[] = new int[index];

        for(int i = 0;i < index;i++){
            inter[i] = temp[i];
        }

        return inter;
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

        int inter[] = intersection_array(arr1,arr2);

        System.out.print("Intersection Array : ");
        display_array(inter);
    }
    sc.close();
}
