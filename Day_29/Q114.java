import java.util.*;
class Q114{
    static Scanner sc = new Scanner(System.in);

    //Input The Array
    static void input_array(ArrayList<Integer> arr,int n){
        for(int i = 0;i < n;i++) arr.add(sc.nextInt());
    }

    //Display The Array
    static void display_array(ArrayList<Integer> arr){
        for(int i = 0;i < arr.size();i++) System.out.print(arr.get(i) + "\t");
        System.out.println();
    }

    //Insert Element
    static void insert_element(ArrayList<Integer> arr){
        int pos,val;
        System.out.print("Enter position and value: ");
        pos = sc.nextInt();
        val = sc.nextInt();
        if(pos < 0 || pos > arr.size()) System.out.println("Invalid position");
        else arr.add(pos,val);
    }

    //Delete Element
    static void delete_element(ArrayList<Integer> arr){
        int pos;
        System.out.print("Enter position: ");
        pos = sc.nextInt();
        if(pos < 0 || pos >= arr.size()) System.out.println("Invalid position");
        else arr.remove(pos);
    }

    //Search Element
    static void search_element(ArrayList<Integer> arr){
        int key;
        System.out.print("Enter element to search: ");
        key = sc.nextInt();
        for(int i = 0;i < arr.size();i++){
            if(arr.get(i) == key){
                System.out.println("Element found at position " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    //Sort Array
    static void sort_array(ArrayList<Integer> arr){
        Collections.sort(arr);
        System.out.println("Array sorted successfully");
    }

    //Menu
    static void menu(){
        System.out.println("\n1. Display Array");
        System.out.println("2. Insert Element");
        System.out.println("3. Delete Element");
        System.out.println("4. Search Element");
        System.out.println("5. Sort Array");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args){
        int n,choice;
        System.out.print("Enter size of array: ");
        n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        input_array(arr,n);
        do{
            menu();
            choice = sc.nextInt();
            switch(choice){
                case 1: display_array(arr); break;
                case 2: insert_element(arr); break;
                case 3: delete_element(arr); break;
                case 4: search_element(arr); break;
                case 5: sort_array(arr); break;
                case 6: System.out.println("Program ended"); break;
                default: System.out.println("Invalid choice");
            }
        }while(choice != 6);
        sc.close();
    }
}
