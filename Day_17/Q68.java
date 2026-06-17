import java.util.Scanner;

class Q68{

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

    //Find Common Elements
    static int[] common_elements(int arr1[],int arr2[]){

        int temp[] = new int[Math.min(arr1.length,arr2.length)];

        int index = 0;

        for(int i = 0;i < arr1.length;i++){

            for(int j = 0;j < arr2.length;j++){

                if(arr1[i] == arr2[j]){
                    temp[index++] = arr1[i];
                    break;
                }
            }
        }

        int common[] = new int[index];

        for(int i = 0;i < index;i++){
            common[i] = temp[i];
        }

        return common;
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

        int common[] = common_elements(arr1,arr2);

        System.out.print("Common Elements : ");
        display_array(common);
    }
    sc.close();
}
