import java.util.*;
class Q36{
    //Generating The Pattern
    static void print_pattern(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                if(i == 0 || j == 0 || i == n-1 || j == n-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Validating Input
        if(n <= 0){
            System.out.print("Invalid Input");
        }
        //Printing The Result By Calling The Function
        else{
            print_pattern(n);
        }
        sc.close();
    }
}