import java.util.*;

class Q99{
    static Scanner sc = new Scanner(System.in);

    //Function To Sort Names
    static void sort_names(String arr[]){

        //Sort Names
        Arrays.sort(arr);
    }

    public static void main(String args[]){
        int n = sc.nextInt();

        String arr[] = new String[n];

        for(int i = 0;i < n;i++){
            arr[i] = sc.next();
        }

        sort_names(arr);

        //Print Result
        for(int i = 0;i < n;i++){
            System.out.println(arr[i]);
        }

        sc.close();
    }
}