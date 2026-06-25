import java.util.*;

class Q97{
    static Scanner sc = new Scanner(System.in);

    //Function To Merge Two Sorted Arrays
    static ArrayList<Integer> merge_sorted_arrays(int arr1[],int arr2[]){
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        //Merge Arrays
        while(i < arr1.length && j < arr2.length){

            if(arr1[i] < arr2[j]){
                ans.add(arr1[i]);
                i++;
            }
            else{
                ans.add(arr2[j]);
                j++;
            }
        }

        //Remaining Elements
        while(i < arr1.length){
            ans.add(arr1[i]);
            i++;
        }

        while(j < arr2.length){
            ans.add(arr2[j]);
            j++;
        }

        return ans;
    }

    public static void main(String args[]){
        int n1 = sc.nextInt();

        int arr1[] = new int[n1];

        for(int i = 0;i < n1;i++) arr1[i] = sc.nextInt();

        int n2 = sc.nextInt();

        int arr2[] = new int[n2];

        for(int i = 0;i < n2;i++) arr2[i] = sc.nextInt();

        ArrayList<Integer> ans = merge_sorted_arrays(arr1,arr2);

        //Print Result
        for(int i = 0;i < ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

        sc.close();
    }
}