import java.util.*;

class Q100{
    static Scanner sc = new Scanner(System.in);

    //Function To Sort Words By Length
    static void sort_by_length(String arr[]){

        //Sort Words
        Arrays.sort(arr,(a,b) -> a.length() - b.length());
    }

    public static void main(String args[]){
        int n = sc.nextInt();

        String arr[] = new String[n];

        for(int i = 0;i < n;i++){
            arr[i] = sc.next();
        }

        sort_by_length(arr);

        //Print Result
        for(int i = 0;i < n;i++){
            System.out.println(arr[i]);
        }

        sc.close();
    }
}